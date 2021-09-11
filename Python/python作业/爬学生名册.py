import sqlite3
conn=sqlite3.connect('c:/student.db')
while True:
    id=input('plz enter the student ID:(press 0 to log out) ')
    if id=='0':
        break
    name=input('plz enter the name:\n')
    gender=input('plz enter the gender:\n')
    SQL='''insert into base
        (学号，姓名，性别）
    values('%s','%s','%s')'''%(id,name,gender)
    conn.execute(SQL)
    conn.commit()
conn.close()
