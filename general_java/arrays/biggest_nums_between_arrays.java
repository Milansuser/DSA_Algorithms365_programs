// 21. Given two arrays of the same length, return a new array with the bigger number at each position.

import java.util.Arrays;

public class biggest_nums_between_arrays {

    public static int[] printBiggestNumsFromArrays(int arr1[], int arr2[]) {
        int n=arr1.length;
        int result[] = new int[n];
        int i=0,j=0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                result[i] = arr1[i];
            }
            else {
                result[i] = arr2[i];
            }
            i++;
            j++;

        }
        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {4, 9, 2, 7};
        int arr2[] = { 6, 3, 8, 7 };
        int result1[] = printBiggestNumsFromArrays(arr1, arr2);
        System.out.println(Arrays.toString(result1));


    }
    
}
