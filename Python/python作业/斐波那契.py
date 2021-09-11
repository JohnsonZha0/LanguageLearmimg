def Fib(i):
    if i==0:
        return 0
    elif i==1:
        return 1
    else:
        return Fib(i-1)+Fib(i-2)
n=15
print('斐波那契数列的第%d项为%d'%(n,Fib(n)))
