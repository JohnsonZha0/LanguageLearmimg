from tkinter import*

def count():
    money=(v1.get())*int(inp.get())
    v2.set("您应该支付: %d元" %money)


root=Tk()
root.geometry("300x200")
root.title("tk")

v1=IntVar()
radio1=Radiobutton(root,text="三元套餐",variable=v1,value=3)
radio1.pack()
radio2=Radiobutton(root,text="五元套餐",variable=v1,value=5)
radio2.pack()

lb1=Label(root,text="请输入份数:")
lb1.pack()

inp=Entry(root)
inp.pack()

btn=Button(root,text="计算",command=count)
btn.pack()

v2=StringVar()
lb2=Label(root,textvariable=v2)
lb2.pack()

root.mainloop()
