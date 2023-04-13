class HotDrink():
    def __init__(self, name:str, volume:float) -> None:
        self._name = name
        self._volume = volume
    
    @property
    def name(self):
        return self._name
    
    @property
    def volume(self):
        return self._volume
    
    @name.setter
    def name(self, name):
        self._name = name
    
    @volume.setter
    def volume(self, volume):
        self._volume = volume

    def HotDrink(self, name:str, volume:float):
        self._name = name
        self._volume = volume
    
    def Drink(self):
        print(f"You drink {self._volume} ml {self._name}")


drink = HotDrink("Tea", 45)
  
drink.volume = 19
  
print(drink.volume, drink.name)