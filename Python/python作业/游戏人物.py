class Person:
    def __init__(self, name, sex, age, exp):
        self.name = name
        self.sex = sex
        self.age = age
        self.fight = exp

    def playphone(self):
            self.fight = self.fight - 200
    def learnpython(self):
            self.fight = self.fight + 100
    def copyhomework(self):
            self.fight = self.fight - 500

    def detail(self):
            temp = "姓名:%s ; 性别:%s ; 年龄:%s ; 战斗力:%s" % (self.name, self.sex, self.age, self.fight)
            print(temp)

xi = Person('小鹿纯子', 'fem', 18, 1000)
nan = Person('南乡小雄','ma', 20, 1800)
mei= Person('美智', 'fem', 19, 2500)
xi.learnpython()
xi.learnpython()
xi.playphone()
mei.copyhomework()

xi.detail()
nan.detail()
mei.detail()
