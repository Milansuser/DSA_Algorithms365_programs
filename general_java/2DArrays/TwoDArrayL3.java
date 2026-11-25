
public class TwoDArrayL3 
{
    static void getSwapTwoColumns(int arr[][]) 
    {
        for (int row = 0; row < arr.length; row++) {
            int left = 0;
            int right = arr.length - 1;
            int temp = arr[row][left];
            arr[row][left] = arr[row][right];
            arr[row][right] = temp;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
            }
            System.out.println();
        }

    }

    //print boundary elements

    static void printBoundaryElements(int arr[][])
    {
        int var1 = 1;
        int var2 = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == arr[var1][var2]) {
                    continue;

                }
                System.out.println(arr[row][column] + " ");
            }

        }

    }
    
    static void printBoundaryElementsTwo(int arr[][])
    {
        int var1 = 1;
        int var2 = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (row == 0 || column == 0 && row == arr.length - 1 || column == arr.length - 1 &&
                        row == 0 || column == arr[0].length - 1 && row == arr.length - 1 || column == 0) {
                    System.out.print(arr[row][column] + " ");

                }
                //System.out.println();
            }
            System.out.println();
        }

    }

    static void printCornerElements(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (row == 0 && column == 0 || row == 0 && column == arr.length - 1
                        || row == arr.length - 1 && column == 0 || row == arr.length - 1 && column == arr.length - 1) {
                    System.out.print(arr[row][column]);

                }

            }
            System.out.println();
        }

    }
    
    static void printTransposeElements(int arr[][]) {
        int result[][] = new int[arr.length][arr[0].length];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(result[row][column] = arr[column][row]);
            }
            System.out.println();
        }

    }

    static void printTransposeInPlace(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[column][row]);

            }
            System.out.println();
        }
    }

    // getSwapRows 
    public static int[][] getSwapRows(int arr[][]) {
        if (arr == null) {
            return new int[0][0];
        }
        for (int column = 0; column < arr[0].length; column++) {

            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int temp = arr[left][column];
                arr[left][column] = arr[right][column]; // use right
                arr[right][column] = temp;

                left++;
                right--;

                //System.out.println(arr[left][right]);
            }
        }
        return arr;
    }
    
    public static int[][] printTranspose(int a[][],int b[][])
    {
        int result[][] = new int[3][3];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[row][col] += (a[row][k] * b[k][col]);
                }
            }
        }
        return result;
    }
    
    public static void display(int[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid or empty array");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int a[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 8, 1 } };
        int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

        int result[][] = printTranspose(a, b);
        display(result);
        /* for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        } */


        //getSwapTwoColumns(arr);

        //printBoundaryElementsTwo(arr);

        //printCornerElements(arr);

        //printTransposeElements(arr);

        //printTransposeInPlace(arr);

    }

}
