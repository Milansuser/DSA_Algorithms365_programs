public class home_works {

    //count zeros
    static int countZeros(int arr[]) {
        int count = 0;
        for (int nums : arr) {
            if (nums == 0) {
                count += 1;
            } else {
                nums++;
            }
        }
        return count;

    }
    
    static int countNegativeNums(int arr[]) {
        int count = 0;
        for (int nums : arr) {
            if (nums < 0) {
                count += 1;

            } else {
                nums++;
            }
        }
        return count;
    }
    
    static int printMaxValue(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;

    }
    
    static int printMinValue(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //int arr[] = { 1, 0, 4, 6, 0, 2, 0, 0, 0, 0, 0 };
        //int arr[] = { 0, -1, 9, -5, 0, 7, -2, -2 };
        
        //System.out.println(countZeros(arr));

        //System.out.println(countNegativeNums(arr));

        //System.out.println(printMaxValue(arr));

        int arr[] = {6,2,4,1};
        System.out.println(printMinValue(arr));
    }
    
}
