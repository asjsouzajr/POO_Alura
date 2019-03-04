
public class Teste {

	public static void main(String[] args) {
		Funcionario joao = new Gerente();
		joao.setNome("Joao da Silva");
		joao.setSalario(1000.00);
		System.out.println(joao.getBonus());
		System.out.println("Funcionario: "+joao.getNome());
		System.out.println("Salário: "+joao.getSalario());
		
	}

}
