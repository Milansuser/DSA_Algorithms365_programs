//4 Return the difference between the largest and the smallest number.

public class difference_largest_and_smallest {
    public static int getDifferenceMaxMin(int nums[]) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int largest = nums[0];
        int smallest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }

            
        }

        return largest - smallest;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 20, 4, 19, 9, 6 };
        int result = getDifferenceMaxMin(nums);
        System.out.println(result);
        
    }
    
}
