// 23 Given prices of the same items at Shop A and Shop B, return how much money is saved by buying each item at the cheaper shop instead of buying everything at Shop A.
public class betweenShopAandB {

    public static int printSumFromCheaperShop(int a[], int b[]) {
        int result = 0;
        int totalCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (b[i] < a[i]) {
                result += a[i] - b[i];   // money saved
                //totalCount++;            // items where Shop B was cheaper
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {100, 250, 80, 40};
        int arr2[] = { 90, 260, 70, 45 };
        int res= printSumFromCheaperShop(arr1, arr2);
        System.out.println(res);
        

    }
    
}
