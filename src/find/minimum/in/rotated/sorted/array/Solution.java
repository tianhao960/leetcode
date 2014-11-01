package find.minimum.in.rotated.sorted.array;

public class Solution {

    public int findMin(int[] num) {
        int left = 0;
        int right = num.length-1;
        int min = num[0];

        while(left<right-1){
            int mid = left + (right-left)/2;
            if(num[left]<num[mid]){
                min = Math.min(num[left],min);
                left = mid + 1;
            }else if(num[left] > num[mid]){
                min = Math.min(num[mid],min);
                right = mid - 1;
            }else{
                left++;
            }
        }

        min = Math.min(num[right],min);
        min = Math.min(num[left],min);
        return min;
    }

}
