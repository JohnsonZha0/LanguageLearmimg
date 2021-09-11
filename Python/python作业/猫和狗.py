class Animal:
    def eat(self):
        print("%s 吃 " % self.name)
    def drink(self):
        print("%s 喝 " % self.name)
    def run(self):
        print("%s 跑 " % self.name)
class Cat(Animal):
    def __init__(self, name):
        self.name = name
        self.breed='猫'
    def cry(self):
        print('喵喵叫')
class Dog(Animal):
    def __init__(self, name):
        self.name = name
        self.breed='狗'
    def cry(self):
        print('汪汪叫')
c = Cat('猫')
c.eat()
c.drink()
c.run()
c.cry()
d = Dog('狗')
d.eat()
d.drink()
d.run()
d.cry()