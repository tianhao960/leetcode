package search.insert.position;

public class Solution {

    public int searchInsert(int[] A, int target) {
       return searchInsert(A,0,A.length-1,target);
    }


    private int searchInsert(int[] A, int start, int end, int target){
        if(start>end) return start;
        int mid = (start+end)/2;
        int midValue = A[mid];
        if(target == midValue) return mid;
        else if(target<midValue){
            return searchInsert(A,start,mid-1,target);
        }else{
            return searchInsert(A,mid+1,end,target);
        }
    }

}
