package solutions;

public class GreatestEnglishLetterInUpperAndLowerCase {
    public String greatestLetter(String s) {
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            String lower = Character.toString(ch + 32);
            String upper = Character.toString(ch);
            if(s.contains(lower) && s.contains(upper)) {
                return upper;
            }
        }

        return "";


//        Set<Character> set = new HashSet<>();
//
//        for(char ch : s.toCharArray()) {
//            set.add(ch);
//        }
//
//        for(char ch = 'Z'; ch >= 'A'; ch--) {
//            if(set.contains(ch) && set.contains((char)(ch + 32))) {
//                return "" + ch;
//            }
//        }
//
//        return "";
    }
}
