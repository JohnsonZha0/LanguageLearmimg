from tkinter import *

root = Tk()
root.geometry('300x300')
cv = Canvas(root, bg='yellow')

cv.create_oval((10,40,290,260),fill='red')
cv.create_oval((30,70,270,230),fill='blue')

cv.pack()
root.mainloop()
