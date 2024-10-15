Copiar cC3digo
import java.util.ArrayList;
import java.util.List;
class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
}
class Empresa {
	private String nome;
	private List<Empregado> empregados = new ArrayList<>();
	public Empresa(String nome) {
		this.nome = nome;
	}
	public void adicionarEmpregado(Empregado empregado) {
		empregados.add(empregado);
	}
	public List<Empregado> getEmpregados() {
		return empregados;
	}
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("JoC#o", "Desenvolvedor",
		                                     5000);
		Empresa empresa = new Empresa("Empresa X");
		empresa.adicionarEmpregado(empregado1);
		for (Empregado emp : empresa.getEmpregados()) {
			System.out.println(emp.getNome() + ", " + emp.getCargo());
		}
	}
}