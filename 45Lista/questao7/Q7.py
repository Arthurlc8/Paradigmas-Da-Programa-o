class Professor:
    def __init__(self, nome):
        self.nome = nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

# Exemplo de uso
professor1 = Professor("Carlos")
escola = Escola("Escola A")
escola.adicionar_professor(professor1)
print([prof.nome for prof in escola.professores])



