class Motor {
	private int potencia;
	public Motor(int potencia) {
		this.potencia = potencia;
	}
	public int getPotencia() {
		return this.potencia;
	}
}
class Carro {
	private String marca;
	private String modelo;
	private Motor motor;
	public Carro(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	public String detalhes() {
		return "Carro: " + this.marca + ", " + this.modelo + ", Motor:
		       " + this.motor.getPotencia() + " HP";
	}
	public static void main(String[] args) {
		Motor motor = new Motor(150);
		Carro carro = new Carro("Toyota", "Corolla", motor);
		System.out.println(carro.detalhes());
	}
}