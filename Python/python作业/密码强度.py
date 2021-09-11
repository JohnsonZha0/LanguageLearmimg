def codelevel(c):
    level=0
    for i in range(0,len(c)-1):
      if c[i]>'0'and c[i]<'9':
          l1=1
      else:
          if c[i]>'A'and c[i]<'Z':
              l2=1
          else:
              if c[i] > 'a' and c[i] < 'z':
                  l3 = 1
              else:
                  if(len(c)>7):
                      l4=1
    level = l1 + l2 + l3 + l4
    return(level)
code=print("请输入测试密码：")
codele=codelevel(code)
print("密码强度为%d级",codele)