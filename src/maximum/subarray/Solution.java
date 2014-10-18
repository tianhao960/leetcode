package maximum.subarray;

public class Solution {

    public int maxSubArray(int[] A) {
        int max = A[0];
        int[] result = new int[A.length];
        result[0] = A[0];


        for(int i = 1; i<A.length;i++){
            int temp = result[i-1] + A[i];
            if(temp>A[i]){
                result[i] = temp;
            }else{
                result[i] = A[i];
            }
            if(result[i]>max){
                max = result[i];
            }
        }
        return max;
    }


    public static void main(String[] args){
        Solution s = new Solution();
        int A[] = {4,-1,2,1};
        System.out.println(s.maxSubArray(A));
    }
}
