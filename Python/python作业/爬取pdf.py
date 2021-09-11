import requests
url="https://wqbook.wqxuetang.com/read/pdf/191582"
r=requests.get(url)
data=r.content
fobj=open("数据库基础.pdf",'wb')
fobj.write(data)
fobj.close()