package wordbreak;

import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public boolean wordBreak(String s, Set<String> dict) {
        if(dict.contains(s)) return true;
       int len = s.length();
       boolean[][] result = new boolean[len][len+1];

       for(int i = 0;i<len;i++){
           String temp = s.substring(i,i+1);
           result[i][1] = dict.contains(temp);
       }

       for(int curLen = 2;curLen<=len;curLen++){
           for(int beginIndex = 0;beginIndex<len-curLen+1;beginIndex++){
               String temp = s.substring(beginIndex,beginIndex+curLen);
               if(dict.contains(temp)){
                   result[beginIndex][curLen] = true;
               }else{
                   for(int spliteLen =1 ;spliteLen<curLen;spliteLen++){
                       if(result[beginIndex][spliteLen] && result[beginIndex+spliteLen][curLen-spliteLen]){
                           result[beginIndex][curLen] = true;
                           break;
                       }
                   }
               }
           }
       }

       return result[0][len];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Set<String> dict = new TreeSet<>();
        dict.add("a");
        dict.add("abc");
        dict.add("b");
        dict.add("cd");
        System.out.println(solution.wordBreak("abcd",dict));
    }
}
