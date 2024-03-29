package solutions;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;

//        int[] result = new int[temperatures.length];
//
//        for (int i = 0; i < temperatures.length; i++) {
//            int days = 0;
//            for (int j = i; j < temperatures.length; j++) {
//                days++;
//                if(temperatures[j] > temperatures[i]){
//                    result[i] = days;
//                    break;
//                }
//                else if(j == temperatures.length - 1){
//                    result[i] = 0;
//                }
//            }
//        }
//
//        return result;
    }
}
