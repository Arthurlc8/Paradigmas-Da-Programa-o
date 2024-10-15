package main
import "sync"
var (
instance *Configuracao
once sync.Once
)
type Configuracao struct{}
func GetInstancia() *Configuracao {
once.Do(func() {
instance = &Configuracao{}
})
return instance
}
func main() {
config1 := GetInstancia()
config2 := GetInstancia()
fmt.Println(config1 == config2) // Saída: true (mesma
instância)
}