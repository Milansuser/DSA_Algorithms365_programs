public class first_last_element_in_array {
    void printFirstAndLastElement(int arr[]) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
        }
        int left = 0;
        int right = arr.length - 1;
        System.out.print("First Element is: "+arr[left]+" Last element is: "+arr[right]);
         
    }

    public static void main(String[] args) {
        first_last_element_in_array obj = new first_last_element_in_array();
        int arr[] = { 10, 20, 30, 40, 50 };
        //int arr[] = {0};
        obj.printFirstAndLastElement(arr);
 
    }
    
}
