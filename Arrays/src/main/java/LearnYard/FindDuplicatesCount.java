package LearnYard;

import Utilities.ArrayUtil;

public class FindDuplicatesCount {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();

        //Approach: Use frequency array.
        //1. find max element
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        int[] freqArr = new int[max + 1];

        for (int j : arr) {
            freqArr[j]++;
        }

        int duplicatesCount = 0;
        for(int x : freqArr){
            if(x > 1){
                duplicatesCount++;
            }
        }

        System.out.println(duplicatesCount);

    }
}
