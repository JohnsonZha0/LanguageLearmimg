import requests
def getHTMLText(url):
    try:
        r=requests.get(url,timeout=30)
        r.raise_for_status()
        r.encoding=r.apparent_encoding
        return r.text
    except:
        return "产生异常"
if __name__=="__main__":
    url="http://img.blog.csdn.net/20150719230252020"
    print(getHTMLText(url))