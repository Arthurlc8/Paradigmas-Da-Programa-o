package main

import "fmt"

type Produto struct {
	Nome  string
	Preco float64
}

func SomarProduto(p1, p2 Produto) float64 {
	return p1.Preco + p2.Preco
}
func main() {
	produto1 := Produto{"Produto 1", 100}
	produto2 := Produto{"Produto 2", 150}
	fmt.Println(SomarProduto(produto1, produto2)) // Saída: 250
}
