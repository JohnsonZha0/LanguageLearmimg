import sqlite3
conn=sqlite3.connect('c:/test.db')
while True:
    date=input("plz enter the date:(press 0 to log out)"

               )
    if date=='0':
        break
    SQL="selct*from base where 日期='%s'"%date
    cur=conn.execute(SQL)
    list=cur.fetchall()
    print('日期','时间','目的','金额')
    for rec in list:
        print(rec[0],rec[1],rec[2],rec[3])
conn.close
