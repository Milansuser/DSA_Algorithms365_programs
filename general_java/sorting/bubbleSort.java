//package general_java.sorting;

public class bubbleSort {

    public void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        
    }
    public static void main(String[] args) {
        //int arr[] = { 5, 4, 3, 2, 1 };
        //int arr[] = { 0, 0, -1, 2, 4 };
        //int arr[] = {};
        int arr[] = {2,-1};


        bubbleSort obj = new bubbleSort();
        obj.bubblesort(arr);

    }
    
}
