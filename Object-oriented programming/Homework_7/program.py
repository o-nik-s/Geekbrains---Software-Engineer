from HotDrinkMachine import *
from Tea import *


def drink_cup(cup):
    if cup != None: cup.Drink() #print(cup.name,)
    else: print('Not Found')


def program():

    tea = list()
    tea.append(Tea("Curtis Mango", 500, 47))
    tea.append(Tea("Assand Mint", 300, 40))
    tea.append(Tea("Assand Mohito", 400, 50))

    hot_drink_machine = HotDrinkMachine()
    hot_drink_machine.init_hot_drink(tea)

    drink_cup(hot_drink_machine.get_product("Assand"))
    drink_cup(hot_drink_machine.get_product("Greenfield"))
    drink_cup(hot_drink_machine.get_product("Mint"))