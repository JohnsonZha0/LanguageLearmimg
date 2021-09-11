import matplotlib.pyplot as plt
import pandas as pd

stdata=pd.read_csv('student.csv')
data1=stdata[stdata['Gender']=='male']
data2=stdata[stdata['Gender']=='female']

plt.figure()
plt.scatter(data1['Height'],data1['Weight'],c='r',marker='s',label='male')
plt.scatter(data2['Height'],data1['Weight'],c='b',marker='^',label='female')

plt.xlim(150,200)
plt.ylim(40,80)
plt.title('Student Body')


plt.grid()
plt.legend(loc='upper right')
plt.show()