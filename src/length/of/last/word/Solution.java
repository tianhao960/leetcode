package length.of.last.word;

public class Solution {

    public int lengthOfLastWord(String s) {
        if(s==null || s.isEmpty())
            return 0;
        String[] temp = s.trim().split(" ");
        return temp[temp.length-1].length();
    }
}
