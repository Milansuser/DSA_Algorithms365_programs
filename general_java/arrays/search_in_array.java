import java.util.Scanner;
public class search_in_array {

    public static void searchArray(int arr[], int key) {
        if (arr.length <= 1) {
            System.out.println("no element to search");
        }

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element found at the index " + i);
            }

        }

        System.out.println("not found");

    }

    
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        
        sc.close();

        searchArray(arr,search);
    }
    
}
