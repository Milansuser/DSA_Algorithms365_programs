// 24 . Given the scores of three players across matches, return which player (1, 2 or 3) has the highest total.
public class scoresOf3Players_23 {

    public static int printHighestScoreOfPlayers(int arr1[], int arr2[], int arr3[]) {
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            result1 = result1 + arr1[i];
            result2 = result2 + arr2[i];
            result3 = result3 + arr3[i];

        }

        if (result1 > result2) {
            return 1;
        }
        else if (result2 > result3) {
            return 2;
        }
        else {
            return 3;
        }
        

        
    } 
    public static void main(String[] args) {
        int arr1[] = {30, 45, 20};
        int arr2[] = {50, 10, 40};
        int arr3[] = { 25, 35, 30 };
        int result = printHighestScoreOfPlayers(arr1, arr2, arr3);
        System.out.println(result);
        
        
    }
    
}
