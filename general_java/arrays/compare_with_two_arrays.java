import java.util.Arrays;

public class compare_with_two_arrays {
    public static int[] greaterBetweenTwoArrays(int arr[], int arr2[]) {
        int n=Math.min(arr.length,arr2.length);
        int result[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr2[i]) {
                result[i]=arr[i];
            }
            else {
                result[i] = arr2[i];
            }
            
        }

        return result;
            
    }

    public static void main(String[] args) {
        int arr[] = { 4, 9, 2, 7 };
        int arr2[] = { 6, 3, 8, 7 };

        int res[] = greaterBetweenTwoArrays(arr, arr2);
        System.out.println(Arrays.toString(res));

    }
    
}
