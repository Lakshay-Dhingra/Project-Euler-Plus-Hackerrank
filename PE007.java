// https://www.hackerrank.com/contests/projecteuler/challenges/euler007/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    private static int max_val=100000000;
    private static int[] store_prime;
    private static boolean[] not_prime;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        seive();
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            System.out.println(store_prime[n]);
        }
    }

    //Using Sieve of Eratosthenes to find primes till 10001st prime
    //We will also store each prime in an array
    private static void seive()
    {
        int count=0;
        not_prime=new boolean[max_val+1];
        store_prime=new int[10002];

        not_prime[0]=true;
        not_prime[1]=true;
        for(int i=2;i<=max_val;i++)
        {
            if(not_prime[i]==false)
            {
                count++;
                store_prime[count]=i;
                for(int j=2*i;j<=max_val;j+=i)
                {
                    not_prime[j]=true;
                }
            }
            if(count==10001)
            {
                break;
            }
        }
        // System.out.print(count+" ");
    }
}