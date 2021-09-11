from tkinter import *

root =  Tk()
root.wm_title("菜单")
root.geometry("400x300")

menubar = Menu(root)

mathgame = Menu(menubar,tearoff=False)
for item in ['简单题目','中等题目','困难题目']:
    mathgame.add_command(label = item)

paintinggame = Menu(menubar,tearoff=False)
for item in ['开始','打开','查找']:
    paintinggame.add_command(label = item)

help = Menu(menubar,tearoff=False)
for item in ['版权','其他']:
    help.add_command(label = item)

menubar.add_cascade(label = "数学游戏",menu = mathgame)
menubar.add_cascade(label = "画画游戏",menu = paintinggame)
menubar.add_cascade(label = "帮助",menu = help)

root['menu']= menubar
root.mainloop()