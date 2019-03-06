
public class ContaPoupanca extends Conta{
	@Override
	public void atualizaConta(double porc) {
		//super.atualizaConta(porc);
		this.saldo += ((porc/100)*this.saldo)*3;
	}
	@Override
	public void deposita(double valorDep) {
		//super.depositar(valorDep);
			this.saldo += (valorDep - 0.10);
	}
}
