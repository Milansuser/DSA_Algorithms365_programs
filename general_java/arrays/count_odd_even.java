public class count_odd_even {

    public static int[] noOfEvenOdd(int[] arr) {
        
        //return arr.length;
        int even = 0;
        int odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                even++;

            } else {
                odd++;
            }

        }
        return new int[]{even,odd};
        
        

    }

    public static void main(String[] args) {
        //int arr[] = {};
        //int arr[] = { 2, 3 };
        //int arr[] = { 0 };
        int arr[] = { 2 };
        //int arr[] = {9};
        
        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        //int arr[] = { -2, -3, -4, -5 };
        //int arr[] = { -2, -3, -4, -5, 56, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };
        
        noOfEvenOdd(arr);
        int result[] = noOfEvenOdd(arr);
        System.out.println("Even count: " + result[0]);
        System.out.println("Odd count: " + result[1]);
    }
    
}
