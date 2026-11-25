
public class mergeSort {

    public static void merge(int[] a, int low, int high, int mid) {
        int[] temp = new int[a.length];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }

            k++;

        }
        //copy remaining elements
        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = a[j];
            j++;
            k++;

        }

        //copy back from temp[] to original array.
        for (i = low, k = 0; i <= high; i++, k++) {
            a[i] = temp[k];
        }
    }

    public static void mergesort(int[] a, int low, int high) {  //divides the array until we get single element
        if (low >= high) {
            return;
        }
        int mid = low + ((high - low) / 2);
        mergesort(a, low, mid);
        mergesort(a, mid + 1, high);
        merge(a, low, high, mid);
    }

    public static void main(String[] args) {
        int[] nums = {20, 10, 15, 40, 35, 60, 50};
        int low = 0;
        int high = nums.length - 1;
        mergesort(nums, low, high);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }

    }
}
