package LearnYard;

import Utilities.ArrayUtil;
import Utilities.IntegerUtil;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();
        int k = IntegerUtil.takeInput();

        int[] rotatedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            rotatedArray[(i + k) % arr.length] = arr[i];
        }

        ArrayUtil.printArray(rotatedArray);
    }
}
