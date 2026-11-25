public class findDuplicateElements {
    public static int findDuplicate(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                result = arr[i];

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 5, 5 };
        System.out.println(findDuplicate(arr));
    }
    
}
