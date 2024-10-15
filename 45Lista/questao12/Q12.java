class Produto {
	private String nome;
	private double preco;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public double somar(Produto outro) {
		return this.preco + outro.preco;
	}
	public static void main(String[] args) {
		Produto produto1 = new Produto("Produto 1", 100);
		Produto produto2 = new Produto("Produto 2", 150);
		System.out.println(produto1.somar(produto2)); // SaC-da: 250
	}
}