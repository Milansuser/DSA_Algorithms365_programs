public class recurssion {
    static int count = 0;//class variable
    
    public static void fun(int n) {
        count++;
        
        if (n == 0){
            return;

        }
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(5);
        System.out.println("Total count is: " + count);

    }

    
    
}
