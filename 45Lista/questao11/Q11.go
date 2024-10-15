package main

import "fmt"

type Funcionario interface {
	CalcularSalario() float64
}
type FuncionarioHorista struct {
	Horas     int
	ValorHora float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return float64(f.Horas) * f.ValorHora
}

type FuncionarioAssalariado struct {
	SalarioFixo float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.SalarioFixo
}
func main() {
	horista := FuncionarioHorista{160, 50}
	assalariado := FuncionarioAssalariado{5000}
	fmt.Println(horista.CalcularSalario())
	fmt.Println(assalariado.CalcularSalario())
}
