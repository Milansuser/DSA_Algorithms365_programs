public class two_pointers {

    public void printTwoPointers(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            if(left==right){
                System.out.print(arr[left]);
            }
            else {
                System.out.print(arr[left] + " --> " + arr[right]);
            }
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        two_pointers obj = new two_pointers();
        obj.printTwoPointers(arr);
        
    }
    
}
