public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String w1 = String.join("", word1);
//        String w2 = String.join("", word2);
//        return w1.equals(w2);
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for(String w : word1){
            w1.append(w);
        }

        for(String w : word2){
            w2.append(w);
        }

        return w1.toString().equals(w2.toString());
    }
}
