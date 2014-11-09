package single.number.ii;

public class Solution {

    public int singleNumber(int[] A) {
        int len = A.length;
        if(len<3){
            return A[0];
        }
        int result = 0;

        for(int i=0;i<32;i++){
            int pos = 1;
            pos<<=i;
            int count = 0;
            for(int j=0;j<len;j++){
                if((A[j] & pos) == pos){
                    count++;
                }
            }
            if(count%3!=0){
                result|=pos;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.singleNumber(new int[]{0,0,0,5}));
    }
}
