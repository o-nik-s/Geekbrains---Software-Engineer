from abc import ABCMeta, abstractmethod
from Tea import Tea

class VendingMachine:

    __metaclass__ = ABCMeta

    @abstractmethod
    def getProduct(self, name:str):
        raise NotImplementedError

    def getProduct(self, name:str, volume:int, temperature:int):
        raise NotImplementedError