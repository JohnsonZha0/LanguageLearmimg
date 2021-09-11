from tkinter import *
root =Tk()
root.title("菜单")
root.geometry("400x300")
menubar = Menu(root)
def hello():
    print("welcome!")


fmenu = Menu(menubar,tearoff=False)
gmenu = Menu(menubar,tearoff=False)
fmenu.add_command(label = "欢迎",command=print("welcome"))
gmenu.add_command(label="确定")
gmenu.add_command(label="取消")

menubar.add_cascade(label = "欢迎",menu = fmenu)
menubar.add_cascade(label = "退出",menu = gmenu)


root['menu']= menubar
root.mainloop()