public class array_sorted {

    public static boolean isArraySorted(int arr[]) {

        if (arr.length <= 1) {

            System.out.println("Array is either empty or having only one element");
            return false;
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {

                descending = false;
                
            }
            if (arr[i] > arr[i + 1]) {

                ascending = false;
            }
            if (!ascending && !descending) {
                
                return false;
            }
            

        }
        return ascending || descending;

        //one if condition to check both the empty and one element;
        /* if (arr.length == 0 | arr.length==1) {
            System.out.println("Either array is empty of Array has only one element cant find if it is sorted or not");
        }
        else {
            System.out.println("Array is not empty");
        }  */

        //nested if to find wheather the Array is empty or containing only one element;

        /* if (arr.length == 0) {
            System.out.println("Array is empty so cant be processed");
        
        }
        else if (arr.length == 1) {
            System.out.println("Array containing only one element so cant be processed");
            
        } */
    }
    public static void main(String[] args) {
        System.out.println("To check wheather the array is Sorted or Not sorted");
        //int arr[] = { 2, 3 };
        //int arr[] = {0};
        //int arr[] = { 2 };
        //int arr[] = {9};

        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        //int arr[] = { -2, -3, -4, -5 };
        int arr[] = { -2, -3, -4, -5, 5,6, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };
        boolean result= isArraySorted(arr);
        System.out.println(result);

    }
    
}
