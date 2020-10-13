# https://www.hackerrank.com/contests/projecteuler/challenges/euler008/problem
t = int(input().strip())
for a0 in range(t):
    n,k = input().strip().split(' ')
    n,k = [int(n),int(k)]
    num = input().strip()

    #Removing zero from num
    nums = num.split("0")
    #We will split string into smaller strings that doesn't contain zero
    #I will find all consecutive products of k digits and find max in them
    maxprod=0
    for num in nums:
        if(len(num)>=k):
            prod=1
            for i in range(0,k):
                prod*=int(num[i])
            #prod is now the product of first k digits
            if prod>maxprod:
                maxprod=prod
            ptr=0
            for i in range(k,len(num)):
                prod=prod//int(num[ptr])
                ptr+=1
                prod*=int(num[i])
                if prod>maxprod:
                    maxprod=prod
    print(maxprod)
