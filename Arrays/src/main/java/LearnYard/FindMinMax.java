package LearnYard;

import Utilities.ArrayUtil;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();

        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }

    private static int findMin(int[] arr) {
        int min = arr[0];

        for(int x : arr){
            if(min > x){
                min = x;
            }
        }

        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];

        for(int x : arr){
            if(max < x){
                max = x;
            }
        }

        return max;
    }
}
