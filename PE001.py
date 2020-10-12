# If we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .
# Find the sum of all the multiples of  or  below .

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    n=n-1   #because multiples below n

    #finding no. of multiples of 3 and 5 and 15
    mul3=n//3
    mul5=n//5
    mul15=n//15

    #Now sum of multiples of 3 = 3+6+9 (for n=10)
    #Taking 3 common out of it = 3*(1+2+3)
    #                          = 3*((3*(3+1))//2)
    #So Generic Formula to calculate sum of multiples of 3 is:
    # sum3 = 3*(mul3*(mul3+1))//2
    
    sum3=3*(mul3*(mul3+1))//2
    sum5=5*(mul5*(mul5+1))//2
    sum15=15*(mul15*(mul15+1))//2

    ans=sum3+sum5-sum15
    # print(sum3,sum5,sum15)
    print(ans)