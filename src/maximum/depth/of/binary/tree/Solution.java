package maximum.depth.of.binary.tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root,0);
    }

    private int depth(TreeNode node, int depth){
        if(node!=null){
            int leftDepth = 1 + depth(node.left,0);
            int rightDepth = 1+ depth(node.right,0);
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        }
        return depth;
    }
}
