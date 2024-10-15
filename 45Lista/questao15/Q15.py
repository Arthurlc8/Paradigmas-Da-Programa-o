class SaldoInsuficienteException(Exception):
    pass

class ContaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException("Saldo insuficiente")
        self.saldo -= valor

# Exemplo de uso
conta = ContaBancaria(100)
try:
    conta.sacar(200)
except SaldoInsuficienteException as e:
    print(e)


