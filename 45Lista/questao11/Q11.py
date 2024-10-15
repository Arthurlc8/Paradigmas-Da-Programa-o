from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, horas, valor_hora):
        self.horas = horas
        self.valor_hora = valor_hora

    def calcular_salario(self):
        return self.horas * self.valor_hora

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario_fixo):
        self.salario_fixo = salario_fixo

    def calcular_salario(self):
        return self.salario_fixo

# Exemplo de uso
horista = FuncionarioHorista(160, 50)
assalariado = FuncionarioAssalariado(5000)
print(horista.calcular_salario())
print(assalariado.calcular_salario())



