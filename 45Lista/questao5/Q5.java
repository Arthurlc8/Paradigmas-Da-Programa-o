public class Main {
	public static void fazerSom(Animal[] animais) {
		for (Animal animal : animais) {
			System.out.println(animal.som());
		}
	}
	public static void main(String[] args) {
		Animal[] animais = {new Cachorro(), new Gato()};
		fazerSom(animais);
	}
}
