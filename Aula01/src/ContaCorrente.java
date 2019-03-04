
public class ContaCorrente extends Conta {
	@Override
	public void atualizaConta(double porc) {
		//super.atualizaConta(porc);
		this.saldo += ((porc/100)*this.saldo)*2;
	}
}
