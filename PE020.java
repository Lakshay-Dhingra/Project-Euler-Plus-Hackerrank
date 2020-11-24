import java.io.*;
import java.util.*;

public class Solution
{
    // For each number we will decompose the factorial into powers of prime numbers
    // We will remove all extra zeros and then multiply using BigInteger
    // Then We will traverse and find sum of solution

    private static boolean[] prime;
    private static ArrayList<Integer> store_prime;
    private static int max_val=1000;

    public static void main(String[] args)
    {
        int t,n;
        seive();
        Scanner cin=new Scanner(System.in);
        t=cin.nextInt();
        while(t-->0)
        {

        }   
    }

    private static long power(long x,long n)

    private static void seive()
    {
        not_prime=new boolean[max_val+1];
        store_prime=new ArrayList<Integer>();

        not_prime[0]=true;
        not_prime[1]=true;
        for(int i=2;i<=max_val;i++)
        {
            if(not_prime[i]==false)
            {
                store_prime.add(i);
                for(int j=2*i;j<=max_val;j+=i)
                {
                    not_prime[j]=true;
                }
            }
        }
    }

}