// 13. Return true if the numbers are in increasing order, otherwise false.
public class isArrayIncreasing {

    public static boolean printIsAsc(int arr[]) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;

            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { -1,0};
        boolean res = printIsAsc(arr);
        System.out.println(res);
        
    }
    
}
