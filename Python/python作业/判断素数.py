import math
def primenum(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    for i in range(2, int(math.sqrt(n))+1): 
        if n % i == 0:
            return False
    return True
print("请输入一个数字:")
num = int(input())
print(primenum(num))