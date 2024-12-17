package LearnYard;

import Utilities.ArrayUtil;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();

        //Two Pointer Approach

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        ArrayUtil.printArray(arr);
    }
}
