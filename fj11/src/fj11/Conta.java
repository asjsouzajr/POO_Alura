package fj11;

public class Conta {
	private String nome;
	private double saldo;
	private int agencia;

	public Conta(String nome, int agencia, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.agencia);
	}

}
