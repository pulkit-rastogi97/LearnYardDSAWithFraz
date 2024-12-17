package Leetcode;

import Utilities.ArrayUtil;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.takeInput();

        int actualSumOfArray = 0;
        for(int x : arr){
            actualSumOfArray += x;
        }

        int n = arr.length;
        int expectedSumOfArray = (n * (n + 1)) / 2;

        int missingNumber = expectedSumOfArray - actualSumOfArray;
        System.out.println(missingNumber);
    }
}
