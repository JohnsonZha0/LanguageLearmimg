from tkinter import *

def judge():
    if CheckVar1.get()==1 and CheckVar2.get()==1:
        print("您喜欢体育和音乐")
    elif CheckVar1.get()==1 and CheckVar2.get()!=1:
        print("您喜欢体育，不喜欢音乐")
    elif CheckVar1.get()!=1 and CheckVar2.get()==1:
        print("您喜欢音乐，不喜欢体育")
    else:
        print("您既不喜欢体育又不喜欢音乐")

root=Tk()
root.geometry("275x150")
root.title("tk")

CheckVar1=IntVar()
CheckVar2=IntVar()
c1=Checkbutton(root,text="体育",variable=CheckVar1,onvalue=1,offvalue=0)
c1.place(relx=0.4,rely=0.1)
c2=Checkbutton(root,text="音乐",variable=CheckVar2,onvalue=1,offvalue=0)
c2.place(relx=0.4,rely=0.3)

btn=Button(root,text="验证",command=judge)
btn.place(relx=0.45,rely=0.65)

root.mainloop()



