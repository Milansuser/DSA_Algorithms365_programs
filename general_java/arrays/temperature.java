//7. Given a week of temperatures, return how many days were hotter than the day before.
public class temperature {
    public static int isGreaterTemperature(int arr[]) {
        int count = 0;
        
        if (arr == null || arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length-1    ; i++) {
            if (arr[i+1] > arr[i]) {
                count++;
                
            }
        }

        return count;
        
    }

    public static void main(String[] args) {
        //int arr[] = {};
        int arr[] = { 30, 32, 31, 35, 36, 34, 37 };
        int result = isGreaterTemperature(arr);
        System.out.println(result);
        
        
    }
}
