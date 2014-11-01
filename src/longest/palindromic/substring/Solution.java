package longest.palindromic.substring;

public class Solution {

    public String longestPalindrome(String s) {

        if(s.length() == 1) return s;
        if(s.length() == 2){
               if(s.charAt(0) == s.charAt(1)){
                   return s;
               }
               else{
                   return s.substring(0,1);
               }
        }

        int[][] a = new int[2][s.length()];

        int maxLength = 1;
        int maxIndex = 0;

        for(int i=0;i<s.length();i++){
            a[0][i] = 1;
        }

        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                a[1][i] = 1;
                maxLength = 2;
                maxIndex = i;
            }else{
                a[1][i] = 0;
            }
        }


        for(int i = 2;i<s.length();i++){
            int[] b = new int[s.length()];
            for(int j=i;j<s.length();j++){
                if(a[0][j-1] == 1 && s.charAt(j) == s.charAt(j-i)){
                   b[j] = 1;
                   maxLength = i +1;
                   maxIndex = j;
                }else{
                    b[j] = 0;
                }
            }
            a[0] = a[1];
            a[1] = b;
        }

        return s.substring(maxIndex-maxLength+1,maxIndex+1);
    }


    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
