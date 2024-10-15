package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	Saldo float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.Saldo {
		return errors.New("Saldo insuficiente")
	}
	c.Saldo -= valor
	return nil
}
func main() {
	conta := ContaBancaria{100}
	err := conta.Sacar(200)
	if err != nil {
		fmt.Println(err)
	}
}
