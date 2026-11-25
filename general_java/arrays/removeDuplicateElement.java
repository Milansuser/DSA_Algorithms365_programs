

public class removeDuplicateElement {
    static int getDistinctElementsFromArray(int nums[])
    {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];

            }
        }
        return j + 1;

        //homework

    }
    
    static void getDuplicates(int nums[]) {
        int writeIndex = 0;
        if (nums == null) {
            return;
        }
                

        for (int readIndex=1; readIndex < nums.length - 1; readIndex++) {

            if (nums[readIndex] == nums[readIndex - 1]) {
                continue;
            } else {
                nums[writeIndex] = nums[readIndex-1];
                writeIndex++;
        }

        }
        if (writeIndex == 0) {
            nums[writeIndex] = nums[0];
            writeIndex++;

        }
        
        while (writeIndex < nums.length) {
            nums[writeIndex] = 0;
            writeIndex++;
        }
        return;

    }
    public static void main(String[] args) {
        int nums[] = { 1, 1, 2,2,2,2,2,2, 3, 5, 5, 8 };
        //int result=getDistinctElementsFromArray(nums);
        getDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);

        }
        int var = nums[nums.length - 1];
        System.out.println(var);

    }
    
}
