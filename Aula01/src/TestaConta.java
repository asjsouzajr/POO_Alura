
public class TestaConta {
	public static void main(String[] args) throws Exception {
		Conta cc1 = new ContaCorrente();
		Conta cp1 = new ContaPoupanca();
		cc1.deposita(50);
		cc1.saca(10);
		/*cc1.atualizaConta(10);
		System.out.println(cc1.getSaldo());
		cp1.deposita(100);
		cp1.atualizaConta(10);
		System.out.println(cp1.getSaldo());*/		
	}
}
