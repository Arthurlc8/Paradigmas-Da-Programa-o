public class ContaBancaria {
	private String titular;
	private double saldo;
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	public String exibirSaldo() {
		return "Saldo atual: R$" + this.saldo;
	}
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("JoC#o", 500);
		conta.depositar(100);
		System.out.println(conta.exibirSaldo());
		conta.sacar(200);
		System.out.println(conta.exibirSaldo());
	}
}