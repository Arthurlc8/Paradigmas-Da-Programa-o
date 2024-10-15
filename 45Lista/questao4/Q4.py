class Animal:
    def som(self):
        pass

class Cachorro(Animal):
    def som(self):
        return "Latido"

class Gato(Animal):
    def som(self):
        return "Miau"

# Exemplo de uso
cachorro = Cachorro()
gato = Gato()
print(cachorro.som())
print(gato.som())

