// https://www.hackerrank.com/contests/projecteuler/challenges/euler011/problem
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    int arr[20][20];
    for(int i=0;i<20;i++)
    {
        for(int j=0;j<20;j++)
        {
            cin>>arr[i][j];
        }
    }
    int maxprod=0,prod1,prod2,prod3,prod4;
    for(int i=0;i<20;i++)
    {
        for(int j=0;j<20;j++)
        {
            prod1=arr[i][j];
            prod2=arr[i][j];
            prod3=arr[i][j];
            prod4=arr[i][j];
            for(int k=1;k<4;k++)
            {
                if(i<17 && j<17)    //We can find product in all 3 directions
                {
                    prod1*=arr[i+k][j]; //Vertically
                    prod2*=arr[i][j+k]; //Horizontally
                    prod3*=arr[i+k][j+k]; //Diagonally
                }
                else if(i<17)   //We can find product only vertically
                {
                    prod1*=arr[i+k][j]; //Vertically
                }
                else if(j<17)   //We can find product only horizontally
                {
                    prod2*=arr[i][j+k]; //Horizontally
                }

                //We have not covered second diagonal yet
                if(i>2 && j<17) //We can find product diagonally
                {
                    prod4*=arr[i-k][j+k];  //Diagonally
                }
            }
            //Updating maximum product
            if(maxprod<prod1)
            {
                maxprod=prod1;
            }
            if(maxprod<prod2)
            {
                maxprod=prod2;
            }
            if(maxprod<prod3)
            {
                maxprod=prod3;
            }
            if(maxprod<prod4)
            {
                maxprod=prod4;
            }
        }
    }
    cout<<maxprod;
    return 0;
}
