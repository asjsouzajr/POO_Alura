package funcionario;

public abstract class Funcionario {
	private String nome;
	protected double salario;
	public abstract double getBonus();
	public String getNome() {
		return nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
