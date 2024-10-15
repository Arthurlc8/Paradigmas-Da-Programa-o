class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.__titular = titular
        self.__saldo = saldo
    def depositar(self, valor):
        self.__saldo += valor
        def sacar(self, valor):
 if valor <= self.__saldo:
        self.__saldo -= valor
        else:
        print("Saldo insuficiente")
        def exibir_saldo(self):
        return f"Saldo atual: R${self.__saldo}"
# Exemplo de uso
        conta = ContaBancaria("João", 500)
        conta.depositar(100)
        print(conta.exibir_saldo())
        conta.sacar(200)
        print(conta.exibir_saldo())
