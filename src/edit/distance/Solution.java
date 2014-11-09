package edit.distance;

public class Solution {

    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        if(len1 == 0) return len2;
        if(len2 == 0) return len1;

        int[][] minDistance = new int[len1+1][len2+1];

        for(int i = 0;i<len2+1;i++){
            minDistance[0][i] = i;
        }

        for(int i = 0;i<len1+1;i++){
            minDistance[i][0] = i;
        }


        for(int i = 1;i<len1+1;i++){
            for(int j= 1;j<len2+1;j++){
                int min = Math.min(minDistance[i][j-1]+1,minDistance[i-1][j]+1);
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    min = Math.min(min,minDistance[i-1][j-1]);
                }else{
                    min = Math.min(min,minDistance[i-1][j-1]+1);
                }
                minDistance[i][j] = min;
            }
        }

        return minDistance[len1][len2];
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minDistance("sea","ate"));
    }
}
