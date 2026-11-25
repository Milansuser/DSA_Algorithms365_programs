//package general_java.sorting;

public class selectionsort {

    public void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int currentmin = i;
            
            for (int j = i + 1; i < arr.length; j++) {

                if (arr[j] < arr[currentmin]) {
                    currentmin = j;

                }

            }
            //Swap once
            int temp = arr[i];
            arr[i] = arr[currentmin];
            arr[currentmin] = temp;

            //Display array after every pass
            System.out.println("Pass " + (i + 1) + " : ");
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 9, 4, 8, 5, 6, 3, 7, 2 };
        selectionsort obj = new selectionsort();
        obj.selectionSort(arr);
    }
    
}
