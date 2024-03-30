package solutions;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int result = 0;
        for(String det : details) {
            if(Integer.parseInt(det.substring(11, 13)) > 60){
                result++;
            }
        }
        return result;
    }
}
