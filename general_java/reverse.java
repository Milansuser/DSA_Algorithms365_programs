package general_java;

public class reverse 
{
    public static void main(String[] args) 
    {

        int reverse = 0;
        int number = 121;
        int original = number;

        while (number != 0) 
        {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        
        System.out.println(reverse);

        if (original == reverse) {
            System.out.println("gievn number can be reverseable");
        }
        else {
            System.out.println("given number is not be reversiable");
        }
        

  
    }
    
}
