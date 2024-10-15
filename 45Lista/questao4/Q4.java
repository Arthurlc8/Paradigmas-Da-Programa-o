class Animal {
	public String som() {
		return "";
	}
}
class Cachorro extends Animal {
	@Override
	public String som() {
		return "Latido";
	}
}
class Gato extends Animal {
	@Override
	public String som() {
		return "Miau";
	}
}
public class Main {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		System.out.println(cachorro.som());
		System.out.println(gato.som());
	}
}
