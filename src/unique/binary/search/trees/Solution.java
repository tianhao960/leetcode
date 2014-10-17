package unique.binary.search.trees;

public class Solution {

    public int numTrees(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=numTrees(i)*numTrees(n-i-1);
        }
        return sum;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.numTrees(5));
    }

}
