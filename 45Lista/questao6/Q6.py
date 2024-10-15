class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor

    def detalhes(self):
        return f"Carro: {self.marca}, {self.modelo}, Motor: {self.motor.potencia} HP"

# Exemplo de uso
motor = Motor(150)
carro = Carro("Toyota", "Corolla", motor)
print(carro.detalhes())


