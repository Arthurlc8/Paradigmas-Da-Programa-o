interface Imprimivel {
	String imprimir();
}
class Relatorio implements Imprimivel {
	@Override
	public String imprimir() {
		return "Imprimindo relatC3rio...";
	}
}
class Contrato implements Imprimivel {
	@Override
	public String imprimir() {
		return "Imprimindo contrato...";
	}
}
public class Main {
	public static void main(String[] args) {
		Imprimivel[] documentos = {new Relatorio(), new Contrato()};
		for (Imprimivel doc : documentos) {
			System.out.println(doc.imprimir());
		}
	}
}