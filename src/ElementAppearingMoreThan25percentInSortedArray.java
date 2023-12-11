import java.util.*;
import java.util.stream.Collectors;

public class ElementAppearingMoreThan25percentInSortedArray {
    public int findSpecialInteger(int[] arr) {
        int times = arr.length / 4;
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int val : arr){
//            map.put(val, map.getOrDefault(val, 0) + 1);
//        }
//
//        for(int key : map.keySet()){
//            if(map.get(key) > times){
//                return key;
//            }
//        }
//
//        return 0;

        for(int i = 0; i < arr.length - times; i++){
            if(arr[i] == arr[i + times]){
                return arr[i];
            }
        }
        return 0;
    }
}
