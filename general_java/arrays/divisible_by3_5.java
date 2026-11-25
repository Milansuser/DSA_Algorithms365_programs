
// 9 Return how many numbers are divisible by both 3 and 5.
public class divisible_by3_5 {

    public static int isDivisibleByThreeAndFive(int[] arr) {
        int count = 0;
        if (arr == null || arr.length == 0) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                count += 1;
            }
        }
        return count;

        
    }

    public static void main(String[] args) {

        //int[] arr = { 15, 10, 30, 7, 45 };
        //int arr[] = { 70, 85, 90, 55 };
        //int arr[] = { 40, 22, 35, 90, 18 };
        //int arr[] = {2, 3};
        //int arr[] = { 0 };
        //int arr[] = { 2 };
        //int arr[] = {35};

        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        //int arr[] = {-2, -3, -4, -5};
        //int arr[] = { -2, -3, -4, -5, 56, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };

        int result = isDivisibleByThreeAndFive(arr);

        System.out.println(result);
    }
}
