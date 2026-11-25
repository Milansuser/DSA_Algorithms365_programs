package general_java;
public class errors {

    // error in the return type
    static int add() {
        //return "hellow"; --> gives the error because the return type is initialized as int in the method
        return 19;
    }
    public static void main(String[] args) {
        //syntax error --> 

        //semantic error --> logical error; code is compailed and ranned
        int a = 20;
        int b = 2000;


        int area = 2 * (a + b);
        System.out.println(area);

        //wronf return type

        System.out.println(add());

        int age = 12;
        int Age = 13; // error : duplicate local variable
        System.out.println(age);

        //tyoe missmatch 
        int miss = 10;
        int loss = miss;

        System.out.println(loss);

        
        System.out.println("hellow world>>");
    }
    
}
