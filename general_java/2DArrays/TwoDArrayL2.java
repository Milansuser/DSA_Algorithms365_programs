public class TwoDArrayL2 {

    //get the sum of the array
    static int getSumOfArrays(int arr[][]) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                sum += arr[row][column];

            }
        }
        return sum;
    }

    //get Maximum Element
    static int getMaxElement(int arr[][]) {
        int max = Integer.MIN_VALUE; //arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                if (arr[row][column] > max) {
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
    
    static int getMinElement(int arr[][]) {
        int min = Integer.MAX_VALUE;// Or arr[0][0]
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                if (arr[row][column] < min) {
                    min = arr[row][column];
                }
            }
        }
        return min;
    }

    static int[] getEvenOddCount(int arr[][]) {
        int oddCount = 0;
        int evenCount = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] % 2 == 0) {
                    evenCount++;

                } else {
                    oddCount++;
                }
            }
        }
        return new int[] { evenCount, oddCount };
    }
    
    //search element in a matrix
    static boolean isKeyPresent(int arr[][], int key) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                if (key == arr[row][column]) {

                    return true;
                }

            }
        }
        return false;

    }
    
    //sum of Main Diagonal
    static int getSumOfMainDiagonal(int arr[][]) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            sum = sum + arr[row][row];

        }
        return sum;
    }
    
    // sum of secondary diagonal elements
    static int getSumOfSecondaryDiagonalElements(int arr[][]) {
        int sum = 0;
        for (int column = 0; column < arr.length; column++) {   
            sum += arr[column][arr.length - 1 - column];

        }
        return sum;
    }

    // sum of the every row 
    static int getSumOfRows(int arr[][]) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                sum = sum + arr[row][column];
            }
            System.out.println("the " + row + " row sum is : " + sum);
            sum = 0;
        }
        return sum;
    }
    
    // sum of the every column
    /* static int getSumOfColumns(int arr[][]) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                sum = sum + arr[column][arr.length - 1 - row];

            }
        }
        /* for (int column = 0; column < arr[0].length; column++)
        {
            System.out.println("the " + column + " column sum is : " + sum[column]);
            
        } */
        /* return sum;

    } */ 
    static void getSumOfColumns(int[][] arr) {
    for (int column = 0; column < arr[0].length; column++) {
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            sum += arr[row][column];
        }
        System.out.println("The column " + column + " sum is : " + sum);
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 1 } };

        System.out.println(getSumOfArrays(arr));

        System.out.println(getMaxElement(arr));

        System.out.println(getMinElement(arr));

        int result[] = getEvenOddCount(arr);
        System.out.println("even count: " + result[0] + " Odd count: " + result[1]);

        System.out.println(isKeyPresent(arr, 8));

        int sumOfMainDiagonal = getSumOfMainDiagonal(arr);
        System.out.println("The sum of the Main Diagonal Elements is : "+sumOfMainDiagonal);
        

        int sumOfSecondaryDiagonal = getSumOfSecondaryDiagonalElements(arr);
        System.out.println("The sum of the Secondary Diagonal Elements is : " + sumOfSecondaryDiagonal);

        System.out.println(getSumOfRows(arr));

        getSumOfColumns(arr);
        
        

        
    }
    
}
