package solutions;

public class DetermineColourOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        char[] coordinate = coordinates.toCharArray();

        int alfa = coordinate[0];
        int num = coordinate[1];

        if(alfa % 2 == 1 && num % 2 == 1) {
            return false;
        }
        if(alfa % 2 == 0 && num % 2 == 0) {
            return false;
        }

        return true;
    }
}
