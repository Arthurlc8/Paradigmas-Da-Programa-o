package main

import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
}

func (c *Carro) Acelerar() {
	c.Velocidade += 10
}
func (c *Carro) Frear() {
	if c.Velocidade >= 10 {
		c.Velocidade -= 10
	}
}
func (c Carro) ExibirVelocidade() string {
	return fmt.Sprintf("Velocidade atual: %d km/h", c.Velocidade)
}
func main() {
	carro1 := Carro{"Toyota", "Corolla", 2020, 0}
	carro1.Acelerar()
	fmt.Println(carro1.ExibirVelocidade())
	carro1.Frear()
	fmt.Println(carro1.ExibirVelocidade())
}
