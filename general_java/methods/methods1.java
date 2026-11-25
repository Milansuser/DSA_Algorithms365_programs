package general_java.methods;

public class methods1 {

    //static methods
    public static void greet() {
        System.out.println("this is from the method greet");
        //no args, no return method
    }

    public static void printSum(int a, int b) {
        int c = a + b;
        System.out.println("the sum is : "+c);
        //no return
    }

    public static int getNumber() {
        return 100;
        //no args , but returns
    }
    
    public static int max(int m, int n) { //args and returns
        
        if (m>n){
            return m;
        }
        else{
            return n;
        }
        
        
    }


    public static void main(String[] args) {

        int x = 10, y = 20;
        
        greet();
        printSum(x, y);
        
        int get = getNumber();
        System.out.println(get);

        int newresult = max(x, y);
        System.out.println(newresult);

        
        
    }
    
}
