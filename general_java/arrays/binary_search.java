public class binary_search {

    public int binarySearch(int arr[], int key) {

        if (arr == null) {
            System.out.println("array is null");
            return -1;
        }

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; //calculating the mid index
            if (arr[mid] == key) {//comparing with mid
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        //if not found
        return -1;
    }

    public static void main(String[] args) {
        
        //int arr[] = null;

        //int arr[] = { -1 };

        int arr[] = { 10, 20, 30, 40, 50, 60 };

        binary_search obj = new binary_search();

        int result = obj.binarySearch(arr, 10);

        if (result != -1) {

            System.out.println("element is found at the index: " + result);
        }
        
        else {
            System.out.println("element is not found");
        }
    }
    
}
