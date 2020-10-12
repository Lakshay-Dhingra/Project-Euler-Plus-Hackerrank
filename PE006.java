import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    // Sum of Squares of first n numbers = [n(n + 1)(2n + 1)] / 6
    // Square of Sum of first n numbers = [(n(n+1))/2]^2
    // Subtract these 2
    //Answer after soving eq = [n(n+1)(n-1)(3n+2)]/12

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
            // Calculating the answer in 2 steps
            long half_ans=(n*(n+1))/2;
            long ans = (half_ans*(3*n+2)*(n-1))/6;
            System.out.println(ans);
        }
    }
}