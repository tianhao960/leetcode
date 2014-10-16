package reverse.integer;

public class Solution {

    public int reverse(int x) {

        Long result = 0l;
        while(x!=0){
            Integer curPos = x%10;
            result= result*10+curPos;
            x=x/10;
        }



        return result.intValue();
    }


    public static void main(String[] args){


        Solution s = new Solution();
        System.out.println(s.reverse(123));
        System.out.println(s.reverse(-123));
        System.out.println(s.reverse(100));
        System.out.println(s.reverse(1000000003));
    }
}
