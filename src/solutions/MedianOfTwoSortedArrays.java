package solutions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++){
            arr[i + nums1.length] = nums2[i];
        }

        Arrays.sort(arr);

        if(arr.length % 2 == 0){
            return Double.valueOf((arr[arr.length / 2] + arr[arr.length / 2 - 1])) / 2;
        }
        return arr[arr.length / 2];
    }
}
