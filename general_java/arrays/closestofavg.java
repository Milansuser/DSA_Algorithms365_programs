public class closestofavg {
    public static double isClosestToArray(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        double avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            
        }



        return avg;

    }
    public static void main(String[] args) {
        int arr[] = { 2, 9, 4, 15 };
        System.out.println(isClosestToArray(arr));

    }
    
}
