import java.util.ArrayList;
import java.util.List;
class Professor {
	private String nome;
	public Professor(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
class Escola {
	private String nome;
	private List<Professor> professores = new ArrayList<>();
	public Escola(String nome) {
		this.nome = nome;
	}
	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public static void main(String[] args) {
		Professor professor1 = new Professor("Carlos");
		Escola escola = new Escola("Escola A");
		escola.adicionarProfessor(professor1);
		for (Professor prof : escola.getProfessores()) {
			System.out.println(prof.getNome());
		}
	}
}