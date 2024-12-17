package Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int[] takeInput(){
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
