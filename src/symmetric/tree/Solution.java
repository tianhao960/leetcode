package symmetric.tree;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        List<Integer> leftFirst = new LinkedList<Integer>();
        List<Integer> rightFirst = new LinkedList<Integer>();
        travel(root,leftFirst,true);
        travel(root,rightFirst,false);

        return checkSame(leftFirst,rightFirst);
    }

    private void travel(TreeNode root,List<Integer> list,boolean leftFirst){
        if(root!=null){
            TreeNode first,second;
            if(leftFirst){
                first = root.left;
                second = root.right;
            }else{
                first = root.right;
                second = root.left;
            }

            travel(first,list,leftFirst);
            list.add(root.val);
            travel(second,list,leftFirst);
        }
    }

    private boolean checkSame(List<Integer> leftFirst,List<Integer> rightFirst){
        for(int i=0;i<leftFirst.size();i++){
            if(!leftFirst.get(i).equals(rightFirst.get(i))) return false;
        }
        return true;
    }

}
