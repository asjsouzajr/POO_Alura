
public class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar (double valorDep) {
		this.saldo += valorDep; 
	}
	public void sacar(double valorSaq) {
		if (valorSaq <= this.saldo) {
			this.saldo -= valorSaq;
		} else {
			System.out.println("Saque nao autorizado, Saldo Indisponível!");
		}
	}
	public void atualizaConta(double porc) {
		this.saldo += (porc/100)*this.saldo;
	}
}
