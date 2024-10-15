package main

import "fmt"

type Motor struct {
	Potencia int
}
type Carro struct {
	Marca  string
	Modelo string
	Motor  Motor
}

func (c Carro) Detalhes() string {
	return fmt.Sprintf("Carro: %s, %s, Motor: %d HP", c.Marca,
		c.Modelo, c.Motor.Potencia)
}
func main() {
	motor := Motor{150}
	carro := Carro{"Toyota", "Corolla", motor}
	fmt.Println(carro.Detalhes())
}
