package combinations;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {

        if(n<k || k==0 || n==0) return new LinkedList<List<Integer>>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        List<List<Integer>> t = combine(n-1,k);

        List<List<Integer>> t1  = combine(n-1,k-1);

        if(t.isEmpty() && t1.isEmpty()){
            List<Integer> temp = new LinkedList<Integer>();
            temp.add(n);
            t.add(temp);
            result.addAll(t);
        }else{
            if(!t.isEmpty()){
                result.addAll(t);
            }
            if(t1.isEmpty()){
                List<Integer> temp = new LinkedList<Integer>();
                temp.add(n);
                t1.add(temp);
                result.addAll(t1);
            }else {
                for( List<Integer> temp : t1){
                    temp.add(n);
                }
                result.addAll(t1);
            }
        }

        return result;
    }


    public static void main(String[] args){
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.combine(3,1).toArray()));
    }
}
