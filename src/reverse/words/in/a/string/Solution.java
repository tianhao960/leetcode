package reverse.words.in.a.string;

public class Solution {

    public String reverseWords(String s) {
        String[] result = s.trim().split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i= result.length-1;i>0;i--){
            String temp = result[i].trim();
            if(!temp.isEmpty()){
                stringBuilder.append(temp).append(" ");
            }

        }
        stringBuilder.append(result[0].trim());
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("blue is     sky the"));
    }
}
