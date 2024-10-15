from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        return "Imprimindo relatório..."

class Contrato(Imprimivel):
    def imprimir(self):
        return "Imprimindo contrato..."

# Exemplo de uso
documentos = [Relatorio(), Contrato()]
for doc in documentos:
    print(doc.imprimir())





