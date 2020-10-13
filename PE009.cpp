//https://www.hackerrank.com/contests/projecteuler/challenges/euler009/problem
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPositiveInteger(double x)
{
    if(x<=0)
    {
        return false;
    }
    if(x-floor(x)!=0.0)
    {
        return false;
    }
    return true;
}

int main()
{
    // a+b+c = N  and c = sqrt(a^2+b^2)
    // Substituting c in Ist equation...
    // a+b-N = -sqrt(a^2+b^2)
    // Taking square both sides and finding value of b
    // b=[N*(N-2*a)]/[2*(N-a)]
    // So we will check for every a, and see if b comes out to be a positive integer
    int t;
    long int n,a,b,c,prod,maxprod;
    cin>>t;
    while(t--)
    {
        cin>>n;
        maxprod=-1;
        for(a=1;a<n;a++)
        {
            prod=-1;
            double tempb=double(n*(n-2*a))/double(2*(n-a));
            if(isPositiveInteger(tempb))
            {
                b=(long int)tempb;
                c=n-(a+b);
                prod=a*b*c;
                // cout<<a<<" "<<b<<" "<<c<<" ";
            }
            if(prod>maxprod)
            {
                maxprod=prod;
            }
        }
        cout<<maxprod<<endl;
    }
    return 0;
}