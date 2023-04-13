from HotDrink import HotDrink

class Product(HotDrink):

    def __init__(self, name:str, volume:float, temperature:float):
        super().__init__(name, volume)
        self._temperature = temperature
        
    @property
    def temperature(self):
        return self._temperature
    
    @temperature.setter
    def temperature(self, temperature):
        self._temperature = temperature