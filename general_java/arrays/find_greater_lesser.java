// 3 : Return all numbers that are greater than 50 and less than 100.

import java.util.Arrays;

public class find_greater_lesser {

    public static int[] greater_lesser(int arr[]) {
        if (arr == null || arr.length == 0) {
            
            return new int[] {};
        }
        

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50 && arr[i] < 100) {
                count++;
            }

        }
        //return new int[] {};
        //int result2[] = new int[];

        int result[] = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50 && arr[i] < 100) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;


    }

    public static void main(String[] args) {
        
        //int arr[] = null;

        //int arr[] = {45, 67, 100, 52, 99, 120, 50};
        //int[] arr = { 15, 10, 30, 7, 45 };
        //int arr[] = { 70, 85, 90, 55 };
        //int arr[] = { 40, 22, 35, 90, 18 };
        //int arr[] = {2, 3};
        //int arr[] = { 0 };
        //int arr[] = { 2 };
        int arr[] = {65};
        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr[] = {0, 0, 0, 0, 0, 0, 0};
        //int arr[] = {-2, -3, -4, -5};
        //int arr[] = { -2, -3, -4, -5, 56, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };

        int result[] = greater_lesser(arr);

        System.out.println(Arrays.toString(result));
    }
}
