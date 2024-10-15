class Carro:
 def __init__(self, marca, modelo, ano):
 self.marca = marca
 self.modelo = modelo
 self.ano = ano
 self.velocidade = 0
 def acelerar(self):
 self.velocidade += 10
 def frear(self):
 if self.velocidade >= 10:
 self.velocidade -= 10
 def exibir_velocidade(self):
 return f"Velocidade atual: {self.velocidade} km/h"
# Exemplo de uso
carro1 = Carro("Toyota", "Corolla", 2020)
carro1.acelerar()
print(carro1.exibir_velocidade())
carro1.frear()
print(carro1.exibir_velocidade())