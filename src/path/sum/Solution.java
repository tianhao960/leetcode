package path.sum;

import leetcode.TreeNode;

public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return iter(root,sum);
    }

    private boolean iter(TreeNode node, int sum){

        if(node==null){
            if(sum==0) return true;
            return false;
        }else{
            int val = node.val;
            TreeNode left = node.left;
            TreeNode right = node.right;

            if(left == null && right == null){
                if(sum == node.val) return true;
                return  false;
            }else{
                boolean result = false;
                if(left!=null){
                    result = iter(node.left,sum-val);
                }

                if(!result){
                   if(right!=null) {
                       result = iter(node.right,sum-val);
                   }
                }
                return result;
            }
        }
    }
}
