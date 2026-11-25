package general_java.methods;

public class method_overload {
    
    //different args
    public static void show() {
        System.out.println("hi show");

    }
    
    public static void show(int a) {
        System.out.println("hi show 2");

    }

    public static void show(int a, int b) {
        System.out.println("two integers");
    }

    //different datatype
    public static void display(int a) {
        System.out.println("int");
    }

    public static void display(double a) {
        System.out.println("double");
    }

    public static void display(float a) {
        System.out.println("float");
    }


    public static void display(char a) {
        System.out.println("char");
    }

    public static void display(String a) {
        System.out.println("String");
    }
    
    //different orders of parameters

    public static void print(int a, double b) {
        System.out.println("int and double");
    }

    public static void print(double a, int b) {
        System.out.println("double and int ");
    }

    public static void add(int a, int b) {
        System.out.println("two ints");
    }

    public static void add(double b, double c) {
        System.out.println("two doubles");
    }

    //automatic type promotion
    public static void type(int y) {
        System.out.println("int");
    }

    public static void type(double y) {
        System.out.println("int");
    }

    //exact match gets the same priority

    public static void exact(int y) {
        System.out.println("exact");
    }

    // return type changes
    public static int add1(int a, int b) {
        return a + b;
    }

    /* public static double add1(int a, int b) {
        return a + b;
    } */

    //character promotion
    public static void show1(int a) {
        System.out.println("int");

    }
    
    public static void show1(char a) {
        System.out.println("char");

    }
    
    //parameters names dont matters
    public static void display1(int x) {

    }
    
    /* 
    //error --> parameter name doest matters
    //public static void display(int y);
    */

    //Ambiguity
    public static void show2(float a) {
        System.out.println("float");
    }

    public static void show2(double a) {
        System.out.println("double");
    }


    

    public static void main(String[] args) {

        int x=20;

        show();// no args
        show(x);// single args
        show(10, 20);//double args

        display(10);
        display(20);
        display(40404);
        display(9.0);
        display("a");

        print(10, 28888.0);
        print(4.4, 4);

        add(2,2);
        add(2.2, 2.2);
        
        byte b = 10;
        short s = 20;
        float f = 3.3f;
        double d = 4.5;

        type(b);
        type(s);
        type(f);
        type(d);

        exact(5);

        int result = add1(10, 20);
        System.out.println(result);

        char ch = 'A';
        show1(ch);

        System.out.println("------------------------");

        show2(10);





        
    }
    
}
