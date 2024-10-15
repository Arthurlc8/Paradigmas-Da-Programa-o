class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, outro):
        return self.preco + outro.preco

# Exemplo de uso
produto1 = Produto("Produto 1", 100)
produto2 = Produto("Produto 2", 150)
print(produto1 + produto2)  # Saída: 250
