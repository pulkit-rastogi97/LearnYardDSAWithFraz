package LearnYard;

import Utilities.ArrayUtil;
import Utilities.IntegerUtil;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();
        int element = IntegerUtil.takeInput();
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
