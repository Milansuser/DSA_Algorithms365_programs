public class array_largest {

    public int getLargest(int[] arr1) {
        int largest = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largest) {
                largest = arr1[i];

            }
        }
        return largest;

    }

    public int sumLargest(int arr1[]) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        array_largest obj = new array_largest();

        //int arr1[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr1[] = { 0, 0, 0, 0, 0, 0, 0 };
        //int arr1[] = { -2, -3, -4, -5 };
        //int arr1[] = { -2, -3, -4, -5, 56, 7, 9 };
        int arr1[] = { 222, 333, 444, 555, 666, 111, 000 };
        //int arr1[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr1[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr1[] = { 222, 333, 444, 555, 666, 111, 000 };

        /* int result=obj.getLargest(arr1);
        System.out.println(result);  */

        int result1 = obj.sumLargest(arr1);
        System.out.println(result1);
        
   
    }
    
}
