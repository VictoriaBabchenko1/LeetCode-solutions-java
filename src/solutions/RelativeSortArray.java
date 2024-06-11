package solutions;

import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int a = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    int temp = arr1[a];
                    arr1[a] = arr1[j];
                    arr1[j] = temp;
                    a++;
                }
            }
        }
        Arrays.sort(arr1, a, arr1.length);

        return arr1;
    }
}
