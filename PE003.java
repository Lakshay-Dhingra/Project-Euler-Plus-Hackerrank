// The prime factors of 13195 are 5,7,13 and 29.
// What is the largest prime factor of a given number ?

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    private static boolean[] not_prime;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        seive();    //Finding all prime numbers
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            int sqrtn=(int)Math.sqrt(n);
            // Now we will start from sqrt(n) and see which number is prime and divisible
            // by n
            // But in some cases, the prime factor can be greater than sqrt(n)
            // But there can be exactly 1 such prime factor gt sqrt(n) and its powers
            // greater than 1 can't divide n
            // So we divide the number by all of its prime factors and their powers,
            // and then see if some number is left...
            // If the number that is left is not 1,
            // then, its either prime factor > sqrt(n)
            // or its n (if n is prime, so has no factors)
            long ans=n;
            long ncopy=n;
            boolean flag=false;
            for(int i=sqrtn;i>=2;i--)
            {
                if(not_prime[i]==false)
                {
                    if(n%i==0)
                    {
                        if(flag==false)
                        {
                            ans=i;
                            flag=true;
                        }
                        while(n%i==0)
                        {
                            n=n/i;
                        }
                    }
                }
            }
            if(n>ans)
                ans=n;
            System.out.println(ans);
        }
    }
    
    //Using Sieve of Eratosthenes to find primes...
    private static void seive()
    {
        not_prime=new boolean[1000001];
        not_prime[0]=true;
        not_prime[1]=true;
        for(int i=2;i*i<=1000000;i++)
        {
            if(not_prime[i]==false)
            {
                for(int j=2*i;j<=1000000;j+=i)
                {
                    not_prime[j]=true;
                }
            }
        }
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.print(not_prime[i]+" ");
        // }
    }
}