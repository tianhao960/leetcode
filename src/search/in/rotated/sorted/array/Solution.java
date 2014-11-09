package search.in.rotated.sorted.array;

public class Solution {

    public int search(int[] A, int target) {
      return search(A,target);
    }

    private int search(int[] A, int left, int right, int target){

        if(left<right-1){
            int mid = left + (right - left)/2;
            if(A[mid] == target) return target;

            if(A[left]<A[mid]){
               if(A[mid]>target){
                    return search(A,mid+1,right,target);
               }
            }else{
                if(A[mid]>target){
                    return search(A,left,mid-1,target);
                }else{

                }
            }
        }else{
           if(A[left] == target) return left;
            if(A[right] == target) return right;
            return -1;
        }
        return -1;
    }
}
