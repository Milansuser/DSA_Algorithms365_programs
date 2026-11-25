/* package general_java.2DArrays;
 */
public class twoDimentionalArray {
    static void print2dArray(int arr[][]) {
        //print the elements from the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int columns = 0; columns < arr[0].length; columns++) {
                System.out.println(arr[row][columns]);

            }
            System.out.println();

        }
        //System.out.println(arr);

    }

    //print address of the array
    static void printAddressOfArray(int arr[][]) {
        
        System.out.println("Prints the address of an array");
        System.out.println(arr);
    }

    //print Row address
    static void printRowAddress(int arr[][]) {
        
        System.out.println("Prints the rows address only");
        for (int row = 0; row < arr.length; row++) {
            System.out.print(arr[row] + " ");
        }
        System.out.println();
    }

    //print column address
    static void printColumnAddressOFArray(int arr[][]) {
        
        System.out.println("Print column address");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                System.out.print(arr[column] + " ");
            }
            System.out.println();
        }
    }
    
    //print count of the rows
    static void printRowCount(int arr[][]) {
        
        System.out.println("Print count of the rows");
        System.out.println(arr.length);
    }

    //print the column count from the array
    static void printColumnCount(int arr[][]) {
        
        System.out.println("print column count of an array");
        System.out.println(arr[0].length);
    }

    //print first row
    static void printFirstRowElements(int arr[][]) {
        System.out.println("Print first elements from the arrray");
        for (int column = 0; column < arr[0].length; column++) {
            System.out.print(arr[0][column]+" ");
        }
        System.out.println();
    }
    
    //print last row
    static void printLastRow(int arr[][]) {
        for (int column = 0; column < arr[0].length; column++) {
            System.out.print(arr[arr.length - 1][column] + " ");
        }
        System.out.println();

    }
    
    //print first column
    static void printFirstColumn(int arr[][]) {
        System.out.println("print first column");

        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][1]);
        }

    }
    
    
    //print last column
    static void printLastColumn(int arr[][]) {
        System.out.println("print last column of array");
        int column = arr[0].length - 1;
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][column]);
        }
    }

    //print Main diagonal elements
    static void getMainDiagonalElements(int arr[][]) {
        System.out.println("Main Diagonal Elements");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][row]);

        }
    }
    
    //print Secondary diagonal Elements
    static void getSecondaryElements(int arr[][]) {
        System.out.println("Secondary Diagonal Elements");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row][arr.length - 1 - row]);
        }
    }

    static void getPrintMiddleColumnElements(int arr[][]) {
        System.out.println("print the middle column elements from an array");

        for (int column = 0; column < arr[1].length; column++) {
            System.out.println(arr[column][(arr.length - 1) / 2]);

        }

    }

    
    public static void main(String[] args) {
        int arr[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 8, 1 } };

        print2dArray(arr);

        printAddressOfArray(arr);

        printRowAddress(arr);

        printColumnAddressOFArray(arr);

        printRowCount(arr);

        printColumnCount(arr);

        printFirstRowElements(arr);

        printLastRow(arr);

        printFirstColumn(arr);

        printLastColumn(arr);

        getMainDiagonalElements(arr);

        getSecondaryElements(arr);

        getPrintMiddleColumnElements(arr);
        

    }
    
}
