#1.从文件中读入数据，忽略第0行
import numpy as np
import pandas as pd
filename = 'advertising.csv'
data = pd.read_csv(filename, index_col = 0)
#导入绘图库
import matplotlib.pyplot as plt
#2.绘制自变量与目标变量之间的散点图,电视广告与销量之间的关联
data.plot(kind='scatter',x='TV',y='Sales',title='Sales with Advertising on TV')
plt.xlabel("TV")
plt.ylabel("sales")
plt.show()

#微博广告与销量之间的关联
data.plot(kind='scatter',x='Weibo',y='Sales',title='Sales with Advertising on Weibo')
plt.xlabel("Weibo")
plt.ylabel("sales")
plt.show()

#微信广告与销量之间的关联
data.plot(kind='scatter',x='WeChat',y='Sales',title='Sales with Advertising on WeChat')
plt.xlabel("WeChat")
plt.ylabel("sales")
plt.show()

#3. 建立3个自变量与目标变量的线性回归模型，计算误差。
X = data.iloc[:,0:3].values.astype(float)
y = data.iloc[:,3].values.astype(float)
from sklearn.linear_model import LinearRegression
linreg = LinearRegression()  
linreg.fit(X, y)
#输出线性回归模型的截距和回归系数
print (linreg.intercept_, linreg.coef_)

#4.保存回归模型导文件，以便后续加载使用
from sklearn.externals import joblib
joblib.dump(linreg, 'linreg.pkl')   #保存至文件

#重新加载预测数据
import numpy as np
load_linreg = joblib.load('linreg.pkl')  #从文件读取模型
new_X = np.array([[130.1,87.8,69.2]])
print("6月广告投入：",new_X)
print("预期销售：",load_linreg.predict(new_X) ) #使用模型预测


