package general_java;
public class break_conutinue {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);

        }
        
        System.out.println("this is for the continue ");

        for (int j = 1; j <= 10; j++) {
            if (j == 6) {
                break;

            }
            System.out.println(j);
        }
        
    }
    
}
