public class two_pointer_from_center {

    public void printTwoPointerFromCenterMoveAway(int arr[]) {
        
        int left;
        int right;

        //even length of the array 6 elements
        if (arr.length % 2 == 0) {
            left = (arr.length / 2) - 1;
            right = arr.length / 2;

        }
        
        //odd length
        else 
        {
            left = arr.length / 2;
            right = left;
        }

        while (left >= 0 && right < arr.length) {
            if (left == right) {
                System.out.println(arr[left]);
            }
            else {
                System.out.println(arr[left] + " --> " + arr[right]);
            }
            right++;
            left--;
        }
        
    }
    public static void main(String[] args) {
        //int arr[] = { 10, 20, 30, 40, 50 };
        int arr[] = {10, 20, 30, 40, 50,60};
        
        two_pointer_from_center obj = new two_pointer_from_center();
        obj.printTwoPointerFromCenterMoveAway(arr);
    }
    
}
