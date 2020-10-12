# Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with  and , the first  terms will be:
# 1,2,3,5,8,13,21,34,55,89...
# By considering the terms in the Fibonacci sequence whose values do not exceed , find the sum of the even-valued terms.

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    
    #O(N) Approach -- if n is the number of fibonacci numbers
    #Solving using reccurence relation for sequence containing even fibonacci
    # f(n)=4*f(n-1)+f(n-2)
    #But In this question, n is the limit of fibonacci number so complexity will be far less than O(n)
    
    prev=0
    prevprev=2
    sum=0
    if(n<2):
        print(0)
    else:
        ans=0
        while(ans<=n):
            ans=4*prev+prevprev
            sum+=ans
            prevprev=prev
            prev=ans
        print(sum-ans)