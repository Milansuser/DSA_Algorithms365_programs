// 19 . Given runs scored in each over of a cricket match, return the over number (starting from 1) with the most runs.

public class highestScore {

    public static int findMaxOver(int arr[]) {
        int index=1;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index=i;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 12, 4, 15, 9 ,99};
        System.out.println(findMaxOver(arr));

    }
    
}
