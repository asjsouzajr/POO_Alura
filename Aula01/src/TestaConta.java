
public class TestaConta {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente();
		Conta cp1 = new ContaPoupanca();
		cc1.depositar(100);
		//cc1.sacar(80);
		cc1.atualizaConta(10);
		System.out.println(cc1.getSaldo());
		cp1.depositar(100);
		cp1.atualizaConta(10);
		System.out.println(cp1.getSaldo());		
	}
}
