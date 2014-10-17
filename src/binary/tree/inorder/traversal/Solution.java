package binary.tree.inorder.traversal;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        iter(root,result);
        return result;
    }

    private void iter(TreeNode node, List<Integer> curList){
        if(node!=null){
            iter(node.left,curList);
            curList.add(node.val);
            iter(node.right,curList);
        }
    }
}
