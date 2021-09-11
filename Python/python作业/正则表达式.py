import re
def get_emails(text):
    emails = re.findall(r"[a-z0-9\.\-+_]+@[a-z0-9\.\-+_]+\.[a-z]+", text)
    return emails
def get_mobiles(text):
    mobiles = re.findall(r"1\d{10}", text)
    return mobiles
def get_ips(text):
    ips = re.findall(r"\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b",text)
    return ips

if __name__ == '__main__':
    content =input()
    emails = get_emails(text=content)
    print("邮箱地址"%emails)
    moblies = get_mobiles(text=content)
    print("手机号码"%moblies)
    ips = get_ips(text=content)
    print("ip地址"%ips)



    
'''
mail_add=re.findall(r"^[a-zA-Z0-9]{1,10}@[a-zA-Z0-9]{1,10}.{com|org}$",text)
ip_add  =re.findall(r"^(?:[0-9]{1,3}\.){3}[0-9]{1,3}$",text)
mob_num =re.findall(r"1\d{11}", text)
tel_num =re.findall(r"^(\(\d{3,4}-)|\d{3.4}-）？\d{7,8}$ ",text)
id_num  =re.findall(r"^\d{8,18}|[0-9x]{8,18}|[0-9X]{8,18}?$",text)
ch_chara=re.findall(r"^[\u4e00-\u9fa5]{0,}$",text)
print("text中的邮箱地址是"%mail_add)
print("text中的ip地址是"%ip_add)
print("text中的手机号码是"%mob_num)
print("text中的德律风号码是"%tel_num)
print("text中的身份证号是"%id_num)
print("text中的汉字是"%ch_chara)'''






