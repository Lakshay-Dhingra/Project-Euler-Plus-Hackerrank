import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    // Here, I will use the property
    // a*b = gcd(a,b)*lcm(a,b)

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            if(n==1)
            {
                System.out.println(1);
            }
            else
            {
                long lcm=1;
                long g,prod;
                for(int i=2;i<=n;i++)
                {
                    prod=lcm*i;
                    g=gcd(lcm,i);
                    lcm=prod/g;
                }
                System.out.println(lcm);
            }    
        }
    }

    //finding gcd using euclid's algo
    private static long gcd(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}