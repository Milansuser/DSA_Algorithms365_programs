package general_java;

public class stack_frames {
    

    static void a() {

        b();

    }

    static void b() {

        c();
    }

    static void c() {
        System.out.println("this is from the method C");
    }

    public static void main(String[] args) {
        a();

    }
}
