//package general_java.arrays;

public class array1 {

    //Metjod-1 : print all elements --> traversing of n array
    public void printelements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
    
    //method-2 print first Middle and Last
    void print_first_mid_last(int[] arr) {
        System.out.println("First: " + arr[0]);
        System.out.println("mid: " + arr[arr.length / 2]);
        System.out.println("Last: " + arr[arr.length - 1]);
    }
    
    //method-3 print length of an array

    void print_length(int[] arr) {
        System.out.println(arr.length);
        System.out.println("Length of the array");
        System.out.println(arr);
    }
    
    //method- 4 modify 3rd element

    void update_array(int[] arr) {
        System.out.println(arr[2] = 60);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //method - 5 Demo of reference copy

    void reference_copy(int[] arr) {
        int[] copy = arr;
        System.out.println("before");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("after");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(copy[i]);
        }

    }

    //Method - 6: Different types of arrays

    void different_arrays(int[] numbers, double[] salaries, char[] grades, boolean[] status, String[] names) {

        System.out.println(" ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
    
    void emptyarray(int[] a) {
        System.out.println("empty array");
        System.out.println("Length : " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    
    
    void null_array(int[] b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        array1 obj = new array1();

        int[] arr = { 10, 20, 30, 40, 50};

        obj.printelements(arr);
        obj.print_first_mid_last(arr);
        obj.print_length(arr);
        obj.update_array(arr);
        obj.reference_copy(arr);

        int numbers[] = { 10, 20, 30 };
        double salaries[] = { 30000, 90000, 60.000 };
        char grades[] = { 'A', 'C', 'D' };
        boolean[] status = { true, false, true };
        String [] names={"yash","lakshman","sita"};

        obj.different_arrays(numbers, salaries, grades, status, names);

        int[] a = {  };
        obj.emptyarray(a);

        int[] b = null;
        obj.null_array(b);

 
    }
    
}
