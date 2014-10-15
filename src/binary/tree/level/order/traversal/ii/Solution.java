package binary.tree.level.order.traversal.ii;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new LinkedList<List<Integer>>();
        List<List<Integer>> result =  new LinkedList<List<Integer>>();

        Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();
        tempQueue.offer(root);

        Queue<TreeNode> nextQueue = new LinkedList<TreeNode>();

        List<Integer> iterResult = new LinkedList<Integer>();

        while (!tempQueue.isEmpty() || !nextQueue.isEmpty()){
            if(tempQueue.isEmpty()){
                tempQueue.addAll(nextQueue);
                nextQueue.clear();
                result.add(0,iterResult);
                iterResult =  new LinkedList<Integer>();
            }

            TreeNode node = tempQueue.poll();
            iterResult.add(node.val);
            if(node.left!=null)
                nextQueue.offer(node.left);
            if(node.right!=null)
                nextQueue.offer(node.right);
        }

        result.add(0,iterResult);

        return result;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        node20.left = node15;
        node20.right = node7;

        root.left = node9;
        root.right = node20;

        Solution s = new Solution();
        System.out.println(Arrays.toString(s.levelOrderBottom(root).toArray()));
    }
}