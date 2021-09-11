import numpy as np

# 已知样本数据
# 每行数据分别为性别,身高,体重
knownData = ((1, 180, 85),
             (1, 180, 86),
             (1, 180, 90),
             (1, 180, 100),
 
             (1, 185, 120),
             (1, 175, 80),
             (1, 175, 60),
             (1, 170, 60),

             (1, 175, 90),
             (1, 175, 100),
             (1, 185, 90),
             (1, 185, 80))

knownTarget = ('稍胖', '稍胖', '稍胖', '过胖',
 '太胖', '正常', '偏瘦', '正常',
 '过胖', '太胖', '正常', '偏瘦')

unKnownData = [(1, 180, 70), (1, 160, 90), (1, 170, 85)]

# 使用sklearn库的k近邻分类模型
from sklearn.neighbors import KNeighborsClassifier

# 创建并训练模型
clf = KNeighborsClassifier(n_neighbors=3, weights='distance')
clf.fit(knownData, knownTarget)

# 分类
for current in unKnownData:
 print(current, end=' : ')
 current = np.array(current).reshape(1,-1)
 print(clf.predict(current)[0])






