public class MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0;

        for(int i = 0; i < travel.length; i++){
            result += 3 * travel[i];
        }

        for(String s : garbage){
            result += s.length();
        }

        for(int i = garbage.length - 1; i > 0; i--){
            if(!garbage[i].contains("G")){
                result -= travel[i - 1];
            }
            else{
                break;
            }
        }

        for(int i = garbage.length - 1; i > 0; i--){
            if(!garbage[i].contains("P")){
                result -= travel[i - 1];
            }
            else{
                break;
            }
        }

        for(int i = garbage.length - 1; i > 0; i--){
            if(!garbage[i].contains("M")){
                result -= travel[i - 1];
            }
            else{
                break;
            }
        }

        return result;
    }
}
