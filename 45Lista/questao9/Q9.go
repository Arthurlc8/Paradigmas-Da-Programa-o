package main

import "fmt"

type Imprimivel interface {
	Imprimir() string
}
type Relatorio struct{}

func (r Relatorio) Imprimir() string {
	return "Imprimindo relatório..."
}

type Contrato struct{}

func (c Contrato) Imprimir() string {
	return "Imprimindo contrato..."
}
func main() {
	documentos := []Imprimivel{Relatorio{}, Contrato{}}
	for _, doc := range documentos {
		fmt.Println(doc.Imprimir())
	}
}
