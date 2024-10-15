abstract class Funcionario {
	public abstract double calcularSalario();
}
class FuncionarioHorista extends Funcionario {
	private int horas;
	private double valorHora;
	public FuncionarioHorista(int horas, double valorHora) {
		this.horas = horas;
		this.valorHora = valorHora;
	}
	@Override
	public double calcularSalario() {
		return horas * valorHora;
	}
}
class FuncionarioAssalariado extends Funcionario {
	private double salarioFixo;
	public FuncionarioAssalariado(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	@Override
	public double calcularSalario() {
		return salarioFixo;
	}
	public static void main(String[] args) {
		Funcionario horista = new FuncionarioHorista(160, 50);
		Funcionario assalariado = new FuncionarioAssalariado(5000);
		System.out.println(horista.calcularSalario());
		System.out.println(assalariado.calcularSalario());
	}
}