from tkinter import *
from random import *
def run(n):
    count=0
    score=0
    while(1):
        a=randint(1,10**n)
        b=randint(1,10**n)
        if a+b>10**n:
            continue
        else:
            print("%d+%d=" %(a,b))            
            c=int(input("你的答案是:"))
            count+=1
        if c==a+b:
            score+=1
        if count==10:
            break
    print("本次测试最终得分是:%d" %score)
root=Tk()
root.geometry("320x360")
root.title("数学闯关游戏")
btn1=Button(root,text="简单题目",bg="pink",command=lambda:run(1))
btn1.place(height=120,width=320)
btn2=Button(root,text="中等题目",bg="purple",command=lambda:run(2))
btn2.place(x=0,y=120,height=120,width=320)
btn3=Button(root,text="困难题目",bg="brown",command=lambda:run(3))
btn3.place(x=0,y=240,height=120,width=320)
root.mainloop()
