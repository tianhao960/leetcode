package roman.to.integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<String,Integer> dic = new HashMap<String, Integer>();

     static {

        dic.put("I",1);
        dic.put("V",5);
        dic.put("X",10);
        dic.put("L",50);
        dic.put("C",100);
        dic.put("D",500);
        dic.put("M",1000);

        dic.put("IV",4);
        dic.put("IX",9);

        dic.put("XL",40);
        dic.put("XC",90);

        dic.put("CD",400);
        dic.put("CM",900);
    }


    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0;i<s.length();i++){
            if(i == s.length()-1){
                result+=dic.get(s.substring(i,i+1));
                break;
            }

            String si = s.substring(i,i+2);
            if(dic.containsKey(si)){
                result+=dic.get(si);
                i++;
            }else{
                result+=dic.get(si.substring(0,1));
            }
        }
        return result;
    }


    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MDCCCLXXXIV"));
    }
}
