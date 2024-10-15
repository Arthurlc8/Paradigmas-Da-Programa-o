package main

import "fmt"

func FazerSom(animais []Animal) {
	for _, animal := range animais {
		fmt.Println(animal.Som())
	}
}
func main() {
	animais := []Animal{Cachorro{}, Gato{}}
	FazerSom(animais)
}
