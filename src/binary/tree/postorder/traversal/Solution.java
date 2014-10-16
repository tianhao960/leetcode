package binary.tree.postorder.traversal;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result =  new LinkedList<Integer>();
            if(root==null) return result;
            iter(root,result);
            return  result;
        }

        private void iter(TreeNode node,List<Integer> result){
            if(node!=null){
                iter(node.left,result);
                iter(node.right,result);
                result.add(node.val);
            }
        }

}
