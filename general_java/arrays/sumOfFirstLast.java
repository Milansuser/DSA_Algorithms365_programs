// 14 . Return the sum of the first and the last number.
public class sumOfFirstLast {

    public static int sumOfFirstLast(int arr[]) {
        int n = arr.length;
        int i = arr[0];
        int j = arr[n];
        return i + j;  
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 9, 4 };
        int res = sumOfFirstLast(arr);
        System.out.println(res);
    } 
}
