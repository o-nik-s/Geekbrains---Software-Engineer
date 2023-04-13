from Product import Product

class Tea(Product):

    def __init__(self, name: str, volume: float, temperature: float):
        super().__init__(name, volume, temperature)
