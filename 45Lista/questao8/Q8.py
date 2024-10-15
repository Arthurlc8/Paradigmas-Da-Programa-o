class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

# Exemplo de uso
empregado1 = Empregado("João", "Desenvolvedor", 5000)
empresa = Empresa("Empresa X")
empresa.adicionar_empregado(empregado1)
print([(emp.nome, emp.cargo) for emp in empresa.empregados])




