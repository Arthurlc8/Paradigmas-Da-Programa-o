package main

import "fmt"

type Animal interface {
	Som() string
}
type Cachorro struct{}

func (c Cachorro) Som() string {
	return "Latido"
}

type Gato struct{}

func (g Gato) Som() string {
	return "Miau"
}
func main() {
	cachorro := Cachorro{}
	gato := Gato{}
	fmt.Println(cachorro.Som())
	fmt.Println(gato.Som())
}
