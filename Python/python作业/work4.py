from tkinter import*

def count():
     a=eval(inp1.get())
     var.set(a)
    

root=Tk()
var=IntVar()
var.set("")
root.geometry("300x200")
root.title("小型计算器")

lb1=Label(root,text="公式:")
lb1.place(relx=0.1,rely=0.2)
lb2=Label(root,text="结果:")
lb2.place(relx=0.1,rely=0.4)

inp1=Entry(root)
inp1.place(relx=0.3,rely=0.2)
inp2=Entry(root,textvariable=var)
inp2.place(relx=0.3,rely=0.4)

btn=Button(root,text="计算",command=count)
btn.place(relx=0.38,rely=0.65)

root.mainloop()

