package single.number;

public class Solution {

    public int singleNumber(int[] A) {
        int first = A[0];
        for(int i=1;i<A.length;i++){
            first = first^A[i];
        }

        return first;
    }

    public static void main(String[] args){
        int[] a = {1,1,2,2,3};
        Solution s = new Solution();
        System.out.println(s.singleNumber(a));
    }
}
