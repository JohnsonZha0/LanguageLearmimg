from math import *
from tur
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
goto((w0/4)*(-2*sin(2*k)+sin(k)),(h0/4)*(-2*cos(2*k)+cos(k)))
pendown()
while k<2*pi:
    goto((w0 / 4) * (-2 * sin(2 * k) + sin(k)), (h0 / 4) * (-2 * cos(2 * k) + cos(k)))
    k=k+0.01
done()