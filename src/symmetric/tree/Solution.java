package symmetric.tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;
        return isSymmetric(root.left,root.right);

    }


    private boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        else if(left!=null && right!=null){
            if(left.val!=right.val) return false;
            return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
        }else{
            return false;
        }
    }



}
