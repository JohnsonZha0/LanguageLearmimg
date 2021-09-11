import re
import requests
response=requests.get("http://www.wandoujia.com/apps")
page=response.text
data=re.findall('<a class="cate-link"\s+href="(.+)"\s+title="(.+)">',page)
for line in data:
    print(line[0],line[1])
