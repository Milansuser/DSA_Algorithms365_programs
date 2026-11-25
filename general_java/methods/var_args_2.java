package general_java.methods;

public class var_args_2 {
    //passing different datatypes seperately using var_args
    static void student(String name, int age, int... marks) {
        System.out.println(name);
        System.out.println(age);

        for (int m : marks) {
            System.out.println(m);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        student("AA",30,99,99,89);
        student("PB",45,69,79);

    }
    
}
