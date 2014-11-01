package maximum.product.subarray;

public class Solution {


    public int maxProduct(int[] A) {


        int[] max = new int[A.length];
        int[] min = new int[A.length];

        max[0] = A[0];
        min[0] = A[0];

        int maxProd = A[0];
        for(int i = 1;i<A.length;i++){
            int tempMax = max[i-1] * A[i];
            int tempMin = min[i-1] * A[i];

            max[i] = Math.max(A[i], Math.max(tempMax,tempMin));
            min[i] = Math.min(A[i], Math.min(tempMax,tempMin));

            if(max[i]>maxProd){
                maxProd = max[i];
            }
        }


        return maxProd;
    }
}
