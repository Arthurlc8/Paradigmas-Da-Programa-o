package main

import "fmt"

type Professor struct {
	Nome string
}
type Escola struct {
	Nome        string
	Professores []Professor
}

func (e *Escola) AdicionarProfessor(professor Professor) {
	e.Professores = append(e.Professores, professor)
}
func main() {
	professor1 := Professor{"Carlos"}
	escola := Escola{Nome: "Escola A"}
	escola.AdicionarProfessor(professor1)
	for _, prof := range escola.Professores {
		fmt.Println(prof.Nome)
	}
}
