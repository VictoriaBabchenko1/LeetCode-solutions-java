package solutions;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        if(n % 2 == 0){
            return n;
        }
        else{
            return n - 1;
        }
    }
}
