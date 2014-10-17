package populating.next.right.pointers.in.each.node;

import leetcode.TreeLinkNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public void connect(TreeLinkNode root) {
        if(root!=null){
            List<TreeLinkNode> curLayer = new LinkedList<TreeLinkNode>();
            List<TreeLinkNode> nextLayer = new LinkedList<TreeLinkNode>();

            curLayer.add(root);

            while (!curLayer.isEmpty()){
                for(int i=0;i<curLayer.size();i++){
                    if(i==curLayer.size() -1){
                        curLayer.get(i).next = null;
                    }else{
                        curLayer.get(i).next = curLayer.get(i+1);
                    }


                    TreeLinkNode left = curLayer.get(i).left;
                    if(left!=null) nextLayer.add(left);

                    TreeLinkNode right = curLayer.get(i).right;
                    if(right!=null) nextLayer.add(right);
                }


                curLayer.clear();
                curLayer.addAll(nextLayer);
                nextLayer.clear();
            }
        }
    }
}
