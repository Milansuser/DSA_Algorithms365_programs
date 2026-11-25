public class reverse_array {

    void printReverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    void printIndex(int arr[]) {
        System.out.println("Print the index and the value");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index: " + i + " Value :" + arr[i]);
        }
    }
    
    void printHalfArray(int arr[]) {
        /* for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);

        } */
        
        for (int i = 0; i <= (arr.length - 1 )/ 2; i++) {
            System.out.println(arr[i]);
        }
    }
    
    void printSecondHalf(int arr[]) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    void printAlternate(int arr[]) {

        System.out.println("original array: [ 10, 20, 30, 40, 50 ,60 ]");

        System.out.println("ALternate from start");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);

        }
    }
    
    void printAlternateFromEnd(int arr[]) {

        System.out.println("original array: [ 10, 20, 30, 40, 50 ,60 ]");

        System.out.println("ALternate from end");
        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            System.out.println(arr[i]);

        }
    }
    
    void printEvenIndexValue(int arr[]) {
        System.out.println("Print Even index Values");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }
        }
    }
    
    void printOddIndexValue(int arr[]) {
        System.out.println("Print Odd index values");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);

            }
        }
    }

    void printGreaterThanGivenNumber(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                System.out.println(arr[i]);
            }
        }
    }

    void printBetweenNumber(int arr[], int start, int end) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > start && arr[i] < end) {
                System.out.println(arr[i]);

            }
        }
    }
    
    void printElementsDivisibleByNumber(int arr[], int num) {
        System.out.println("Element divisible by given number");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                System.out.println(arr[i]);
            }
        }
        
    }
    
    //void lessthan40
    

    public static void main(String[] args) {
        reverse_array obj = new reverse_array();

        int arr[] = { 10, 20, 30, 40, 50 ,60,};
        //obj.printReverseArray(arr);

        //obj.printIndex(arr);

        //obj.printHalfArray(arr);
        //obj.printSecondHalf(arr);
        //obj.printAlternate(arr);
        //obj.printAlternateFromEnd(arr);

        //int arr[] = {10, 2,55,99,60,7};
        //obj.printEvenIndexValue(arr);
        //obj.printOddIndexValue(arr);
        //obj.printGreaterThanGivenNumber(arr, 2);

        //obj.printBetweenNumber(arr, 10, 60);
        obj.printElementsDivisibleByNumber(arr, 20);


    }
    
}
