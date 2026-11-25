public class rev_arr_use_pointers {
    public void printReverseOfArray(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        if ( arr == null || arr.length == 0 ){
            System.out.println("The Array is Empty, so cant be reversed");
        }

        for (int i = right; i >= left; i--) {
            
            System.out.println(arr[i]+" "+"index: " +i);
            

        }
    }
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 60};
        rev_arr_use_pointers obj = new rev_arr_use_pointers();
        //int arr[] = { 10, 20, 30, 40, 50 };
        //int arr[] = {};
        //int arr[] = { 0, 0, 0, 10 };
        obj.printReverseOfArray(arr);
    }
}
