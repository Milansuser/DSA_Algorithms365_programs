// 2.
public class return_avg {
    public static double avg_marks(int arr[]) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        double avg = sum / arr.length;
        
        return avg;
    }

    public static void main(String[] args) {
        
        //int arr[] = { 70, 85, 90, 55 };
        //int arr[] = { 40, 22, 35, 90, 18 };
        //int arr[] = {2, 3};
        //int arr[] = { 0 };
        //int arr[] = { 2 };
        //int arr[] = {35};

        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        int arr[] = { -2, -3, -4, -5 };
        //int arr[] = { -2, -3, -4, -5, 56, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };
        double result = avg_marks(arr);
        System.out.println("The Average of the marks is: "+result);

        

        
    }

    
}
