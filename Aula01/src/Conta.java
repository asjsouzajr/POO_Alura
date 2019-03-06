public class Conta {
	protected double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void deposita (double valorDep) {
		this.saldo += valorDep; 
	}
	public void saca(double valorSaq) throws Exception {
		if (valorSaq <= this.saldo) {
			this.saldo -= valorSaq;
			System.out.println(this.getSaldo());
		} 
		else {
			throw new RuntimeException("Saldo Insuficiente");
		}
	}
	public void atualizaConta(double porc) {
		this.saldo += (porc/100)*this.saldo;
	}
}
