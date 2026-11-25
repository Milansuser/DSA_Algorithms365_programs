//package general_java.arrays;

public class original_array {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("reverse the array:");

        
    }
    
    static void change(int[] x) {

        System.out.println("before modification");
        printarray(x);
        x[0] = 89;

        System.out.println("after modification");
        printarray(x);

    }

    public static void main(String[] args) {
        
        int[] arr = { 30, 40, 20, 40 };

        System.out.println("before calling");
        printarray(arr);
        change(arr);
        
        System.out.println("after calling change");
        printarray(arr);
    }
    
}
