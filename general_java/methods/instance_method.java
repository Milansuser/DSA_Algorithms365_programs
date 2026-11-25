package general_java.methods;

public class instance_method {

    //static methods
    public void greet() {
        System.out.println("this is from the method greet");
        //no args, no return method
    }

    public void printSum(int a, int b) {
        int c = a + b;
        System.out.println("the sum is : "+c);
        //no return
    }

    public int getNumber() {
        return 100;
        //no args , but returns
    }
    
    public int max(int m, int n) { //args and returns
        
        if (m>n){
            return m;
        }
        else{
            return n;
        }
    }

    public static void main(String[] args) {

        int x = 10, y = 20;

        //new object for every methods
        instance_method obj1 = new instance_method();
        instance_method obj2 = new instance_method();
        instance_method obj3 = new instance_method();
        instance_method obj4 = new instance_method();
        
        obj1.greet();

        obj2.printSum(x, y);
        
        int get = obj3.getNumber();
        System.out.println(get);

        int newresult = obj4.max(x=30, y=40);
        System.out.println(newresult);

        
        
    }
    
}
