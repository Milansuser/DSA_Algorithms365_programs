public class linear_search {

    void linearsearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("element found at the index: " + i);
                break;

            } else {
                continue;
                //System.out.println("not found");
                
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        linear_search obj=new linear_search();
        obj.linearsearch(arr, 30);
        
        
    }
    
}
