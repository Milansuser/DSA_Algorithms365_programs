//package general_java.arrays;

public class array_using_while {
    static void array_while(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println();
    }

    static void reverse_array(int[] arr) {
        System.out.println("The reverse of the array is");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    static void for_each(int[] arr) {
        System.out.println("arrays usig the for-each loop");
        for (int result : arr) {
            System.out.println(result);

        }
    }

    static void check_array(int[] arr) {
        System.out.println("check in the array");
        
    }

        
    public static void main(String[] args) {

        int arr[] = { 20, 30, 40, 50, 60 };
        array_while(arr);

        reverse_array(arr);

        for_each(arr);

    }
    
   
}
