package general_java.arrays;

public class stocksCompare {

    public static void getStockProfit(int[] array) {
        if(array==null)
        {
            System.out.println("array is null");
            return;
        }
        int maxProfit = 0;

        for (int buy = 0; buy < array.length; buy++) {

            for (int sell = buy + 1; sell < array.length; sell++) {

                int profit = array[sell] - array[buy];

                if (profit > maxProfit) {

                    maxProfit = profit;
                    System.out.println("buying prize: "+array[buy]+" selling prize: "+array[sell]+" profit: "+maxProfit);
                }

            }
        }

        System.out.println(maxProfit);
    }

    public static int maxProfitOptimaized(int [] array)
    {
        //int currProfit=0;
        int minSoFar = 0;
        int maxProfit = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minSoFar) {
                minSoFar = array[i];
            } else {
                int currProfit = array[i] - minSoFar;
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
            }
        }

        return maxProfit;
    }

    static void main(String[] args) {
        int [] array={7,1,5,3,6,4};
        //int [] array={7,6,4,3,1};
        //int [] array={0};
        //int [] array=null;

        //int[] array={};
        //getStockProfit(array);
        int result=maxProfitOptimaized(array);
        System.out.println(result);

    }
}

