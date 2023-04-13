from HotDrink import HotDrink
from VendingMachine import VendingMachine
from Product import Product


class HotDrinkMachine(VendingMachine):
    
    cups = list()

    def init_hot_drink(self, cups:list):
        self.cups = cups
    
    def get_product(self, name:str) -> Product:
        for cup in self.cups:
            if cup.name.__contains__(name): return cup
        return None