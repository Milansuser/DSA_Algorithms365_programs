public class findDigitOfSum {
    static int getSumOfNumberEndingWithDigit(int nums[], int digit) {
        int totalSum = 0;
        
        if (nums == null || nums.length == 0) {
            return -1;
        }


        for (int i = 0; i < nums.length; i++) {
            int result = nums[i] % 10;
            if(result==digit){
                totalSum = totalSum + nums[i];
            }

            
        }
        return totalSum;
        
    }

    public static void main(String[] args) {
        //int nums[] = { 34, 2, 56, 4, 8, 94 };
        //int nums[] = {};
        int nums[] = {0,0,0,0,0};

        int digit = 4;

        System.out.println(getSumOfNumberEndingWithDigit(nums, digit));
        

        
       
    }
    
}
