// 22 . Return the numbers in the first array that are not present in the second array.
import java.util.Arrays;
public class first_array_not_in_second_array {
    public static int[] firstArrayNotInSecondArray(int arr1[], int arr2[]) {
        int n = Math.min(arr1.length, arr2.length);
        int result[] = new int[n];
        int i = 0, j = 0, count = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                result[count++] = arr1[i];
                i++;
            } else {
                j++;
            }
        }
        
        while (i < arr1.length) {
            result[count++] = arr1[i];

        }
        
        return result;


        
        
        

    }

    public static void main(String[] args) {
        int arr1[] = {1, 4, 6, 8, 10};
        int arr2[] = { 4, 8, 12 };
        int result[] = firstArrayNotInSecondArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    
}
