class Calculadora:
    def somar(self, *args):
        return sum(args)

# Exemplo de uso
calc = Calculadora()
print(calc.somar(2, 3))
print(calc.somar(2, 3, 4))


