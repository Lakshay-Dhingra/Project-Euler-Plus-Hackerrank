// https://www.hackerrank.com/contests/projecteuler/challenges/euler010/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    //We will find all the primes till 1 Million (max value of n) using seive
    //We will also store sum of primes for each number

    private static boolean[] not_prime;
    private static long[] sum_prime;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        seive();
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            System.out.println(sum_prime[n]);
        }
    }
    private static void seive()
    {
        not_prime=new boolean[1000001];
        sum_prime=new long[1000001];

        not_prime[0]=true;
        sum_prime[0]=0;
        not_prime[1]=true;
        sum_prime[0]=0;
        
        long sum=0;
        for(int i=2;i<=1000000;i++)
        {
            if(not_prime[i]==false)
            {
                sum+=i;
                for(int j=2*i;j<=1000000;j+=i)
                {
                    not_prime[j]=true;
                }
            }
            sum_prime[i]=sum;
        }

        // for(int i=1;i<=10;i++)
        // {
        //     System.out.print(sum_prime[i]+" ");
        // }
    }
}