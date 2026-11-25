package general_java;
public class inc_dec {

    public static void main(String[] args) {
        
        System.out.println("post and pre increment:");

        /* int a = 10;

        System.out.println(a++);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);

        System.out.println("Section 2 : post dscrement and pre decrement : "); */
/* 
        int b = 14;

        System.out.println(b--);
        System.out.println(b);

        System.out.println(--b);
        System.out.println(b);

        System.out.println(b--);
        System.out.println(b);

        System.out.println(b--);
        System.out.println(b); */

        /* System.out.println("Section 3 : Assignment with post increment");

        int c = 10;
        int d = c++;

        System.out.println(d);
        System.out.println(c);


        System.out.println("Assignment with pre decrement");

        int e = 10;
        int f = ++e;

        System.out.println(e);
        System.out.println(f);
 */

        // home work: take input assign with decrement  (pre and post)
        /*
        int g = 10;
        System.out.println(g++ + 5); // 10 +5 =15
        System.out.println(g); //11

        System.out.println(++g + 5); //17
        System.out.println(g); // 12 */
        
        int h = 10;
        System.out.println(h++ + 5 + ++h); //22
        System.out.println(h++ - ++h); 
        System.out.println(++h - h++);
        System.out.println(++h - h++);
        System.out.println(h);
        System.out.println(++h - (--h));
        System.out.println(h);

        //homw work : mix the expressions 

        System.out.println("mixing of the expressions");
        int x = 3;
        int y = 6;
        int result = x++ + ++x - --y + y--;

        System.out.println("Result: " + result); 
        System.out.println("Final x: " + x);     
        System.out.println("Final y: " + y);

        System.out.println("character increment");
        char ch1 = 'A';
        System.out.println(ch1++);
        System.out.println(ch1);

        System.out.println(++ch1);
        System.out.println(ch1);

        // homw work char decrement

        System.out.println("character decrement");
        char ch2 = 'b';
        //System.err.println(--ch2);
        System.out.println(ch2-- % ch2++);
        System.out.println(ch2);

        System.out.println(++ch2);
        System.out.println(ch2);

        System.err.println();

        // home work : char and ASCII / unicode

        char ch3 = '9'; //unicode -- 57
        System.out.println(++ch3);
        System.out.println(ch3);


        System.out.println("section 9: Boolean");
        //boolean cannot be incremented

        System.out.println("section 10 : litrels --> fixed values will get errors");
        // ++ amd -- can be applied to variables only not for the literals
        //System.out.println(10++); cant be compailed
        



        
    }
    
}
