import requests
import re
url="http://www.ecust.edu.cn"
response=requests.get(url)
response.encoding=response.apparent_encoding
data=response.text
mydata=re.findall("href='(.*?)'title='(.*?)",data)
for item in mydata:
    print(item[0],item[1])
