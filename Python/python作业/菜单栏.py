from tkinter import *
root =  Tk()
root.wm_title("菜单")
root.geometry("400x300")
menubar = Menu(root)
fmenu = Menu(menubar,tearoff=False)

fmenu.add_command(label='打开')
fmenu.add_command(label='关闭')
fmenu.add_command(label='保存')

menubar.add_cascade(label = "文件",menu = fmenu)
root['menu']= menubar
root.mainloop()