from math import *
from turtle import *
setup(600,600)
w0=300
h0=300
pencolor("black")
penup()
goto(-300,0)
pendown()
goto(300,0)
penup()
goto(0,300)
pendown()
goto(0,-300)
penup()
pencolor("blue")
k=0
goto((w0/4)*(2*sin(k)+sin(2*k)),(h0/4)*(2*cos(k)-cos(2*k)))
pendown()
while k<2*pi:
    goto((w0/4)*(2*sin(k)+sin(2*k)),(h0/4)*(2*cos(k)-cos(2*k)))
    k=k+0.01
done()
#-------------------------------------------------
'''import matplotlib.pyplot as plt
from numpy import *
t=arange(0,2*pi,0.02)
plt.plot((w0/4)*(2*sin(k)+sin(2*k)),(h0/4)*(2*cos(k)-cos(2*k)))
plt.show()'''
