def rec(n):
    if n==1:
        return 1
    else:
        return n*rec(n-1)
print("你要求解几的阶乘？")
a=int(input())
print('%d!=%d'%(a,rec(a)))