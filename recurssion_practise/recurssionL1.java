
package recurssion_practise;
import java.util.*;

public class recurssionL1 {
    static void recurse(int number)
    {
        System.out.println(number);
        number++;
        if(number<8){
            recurse(number);
        }

    }

    //first approach
    static int febonaciDp(int number,int[] dp)
    {
        if(number==0) return 0;
        if(number==1) return 1;
        if(dp[number]!=-1)
        {
            return dp[number];
        }
        dp[number]=febonaciDp(number-1,dp)+febonaciDp(number-2,dp);
        return dp[number];

    }

    //bottom up approach --> starts from the smaller problems to bigger
    static int fiboDp(int number)
    {
        if(number==0) return 0;
        int dp[]=new int[number+1];

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=number;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[number];
    }

    //space optimaized code for fiboncci
    static int febOptimaized(int number)
    {
        if(number==0)
        {
            return 0;
        }
        int prev1=0;
        int prev2=1;
        int current;
        for(int i=2;i<=number;i++)
        {
            current=prev1+prev2; // 0 1 1 2 3 5 8
            prev1=prev2;
            prev2=current;

        }
        return prev2;

    }

    public static void main(String[] args) {
        /*int number=10;
        //recurse(number);
        int dp[]=new int[number+1];
        Arrays.fill(dp,-1);
        System.out.println(febonaciDp(number,dp));*/

        //bottom up approach
        /*int number =6;
        Arrays.fill(dp,-1);
        System.out.println(fiboDp(number));*/

        //better space optimaized code
        int number=6;
        System.out.println(febOptimaized(number));


    }
}
