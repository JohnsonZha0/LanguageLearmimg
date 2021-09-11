import numpy as np
import pandas as pd
np.random.seed(1)
df = pd.DataFrame(np.random.rand(25).reshape([5, 5]),
                  index=['A', 'B', 'D', 'E', 'F'],
                  columns=['c1', 'c2', 'c3', 'c4', 'c5'])
#df.loc[["E","F"],"c1":"c5"]
#df.loc["A":"F","c3":"c5"]

c=df.iloc[3:5,0:4]
d=df.iloc[0:5,1:4]
print(c)
print(d)
