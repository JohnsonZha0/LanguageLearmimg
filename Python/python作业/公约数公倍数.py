def hcf(u, v):
    global a
    if u % v == 0:
        a = v
    else:
        m = u % v
        n = v
        hcf(n, m)
    return a
def lcd(u, v, h):
    return u * v / h

u = int(input(" 请输入第一个整数："))
v = int(input(" 请输入第二个整数："))
h = hcf(u, v)
print(" %d 和%d 的最大公约数为：%d" % (u, v, h))
l = lcd(u, v, h)
print(" %d 和%d 的最小公倍数为：%d" % (u, v, l))
