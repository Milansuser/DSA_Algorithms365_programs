// 5.
public class student_pass {

    public static void stu_passing(int arr[]) {
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] >= 35) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        }
    }

    public static void main(String[] args) {
        //int arr[] = { 40, 22, 35, 90, 18 };
        int arr[] = { 2, 3 };
        //int arr[] = { 0 };
        //int arr[] = { 2 };
        //int arr[] = {35};

        //int arr[] = { 10, 100, 20, 40, 30, 60, 70 }; 
        //int arr[] = { 0, 0, 0, 0, 0, 0, 0 };
        //int arr[] = { -2, -3, -4, -5 };
        //int arr[] = { -2, -3, -4, -5, 56, 7, 9 };
        //int arr[] = {222, 333, 444, 555, 666, 111, 000};
        //int arr[] = { 22, 333, 44, 11, 88, 99, 00 };
        //int arr[] = { 3, 6, 2, 7, 4, 9, 0, 6 };
        //int arr[] = { 222, 333, 444, 555, 666, 111, 000 };
        stu_passing(arr);

    }

}
