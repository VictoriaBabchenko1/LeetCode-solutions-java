package solutions;

import java.util.ArrayList;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int vowels1 = 0;
        int vowels2 = 0;

        for(int i = 0; i < s.length() / 2; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                vowels1++;
            }
            if(vowels.indexOf(s.charAt(s.length() - i - 1)) != -1){
                vowels2++;
            }

        }

        return vowels1 == vowels2;
    }
}
