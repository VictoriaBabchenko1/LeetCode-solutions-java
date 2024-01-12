package solutions;

import java.util.ArrayList;

public class DetermineIfStringHalvesAreAlike {
    private int countVowels(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int halfCount1 = countVowels(s.substring(0, s.length() / 2));
        int halfCount2 = countVowels(s.substring(s.length() / 2));

        return halfCount1 == halfCount2;
//        String vowels = "aeiouAEIOU";
//        int vowels1 = 0;
//        int vowels2 = 0;
//
//        for(int i = 0; i < s.length() / 2; i++){
//            if(vowels.indexOf(s.charAt(i)) != -1){
//                vowels1++;
//            }
//            if(vowels.indexOf(s.charAt(s.length() - i - 1)) != -1){
//                vowels2++;
//            }
//
//        }
//
//        return vowels1 == vowels2;
    }
}
