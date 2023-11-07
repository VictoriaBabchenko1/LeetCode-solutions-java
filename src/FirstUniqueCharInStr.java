public class FirstUniqueCharInStr {
    public int firstUniqChar(String s) {
        for(int i = 0 ; i < s.length(); i++){
            char strChar = s.charAt(i);
            if(i == s.lastIndexOf(strChar) && i == s.indexOf(strChar)){
                return i;
            }
        }
        return -1;
    }
}
