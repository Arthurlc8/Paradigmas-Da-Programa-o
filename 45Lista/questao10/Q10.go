package main

import "fmt"

func SomarDois(a int, b int) int {
	return a + b
}
func SomarTres(a int, b int, c int) int {
	return a + b + c
}
func main() {
	fmt.Println(SomarDois(2, 3))
	fmt.Println(SomarTres(2, 3, 4))
}
