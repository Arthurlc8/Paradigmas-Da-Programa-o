package main

import "fmt"

type Empregado struct {
	Nome    string
	Cargo   string
	Salario float64
}
type Empresa struct {
	Nome       string
	Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
	e.Empregados = append(e.Empregados, empregado)
}
func main() {
	empregado1 := Empregado{"João", "Desenvolvedor", 5000}
	empresa := Empresa{Nome: "Empresa X"}
	empresa.AdicionarEmpregado(empregado1)
	for _, emp := range empresa.Empregados {
		fmt.Println(emp.Nome, emp.Cargo)
	}
}
