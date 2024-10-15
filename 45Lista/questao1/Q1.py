class Carro:
 def __init__(self, marca, modelo, ano):
 self.marca = marca
 self.modelo = modelo
 self.ano = ano
 def detalhes(self):
 return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano:
{self.ano}"
# Criando três objetos
carro1 = Carro("Toyota", "Corolla", 2020)
carro2 = Carro("Honda", "Civic", 2018)
carro3 = Carro("Ford", "Focus", 2019)
# Exibindo detalhes
print(carro1.detalhes())
print(carro2.detalhes())
print(carro3.detalhes())