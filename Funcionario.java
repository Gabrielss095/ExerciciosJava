package PacotePOO;

public class Funcionario {

	
	private String nomeFuncionario;
	private char sexoFuncionaro;
	private String cargo;
	private double salario;
	private String periodo;
	
	
	public Funcionario(String nomeFuncionario, char sexoFuncionaro, String cargo, double salario, String periodo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.sexoFuncionaro = sexoFuncionaro;
		this.cargo = cargo;
		this.salario = salario;
		this.periodo = periodo;
	}


	public String getNomeFuncionario() {
		return nomeFuncionario;
	}


	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}


	public char getSexoFuncionaro() {
		return sexoFuncionaro;
	}


	public void setSexoFuncionaro(char sexoFuncionaro) {
		this.sexoFuncionaro = sexoFuncionaro;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void vizualizarDados()
	{
		System.out.println("\nNome Funcionário: "+nomeFuncionario+"\nCargo: "+cargo+"\nPeriodo: "+periodo+"\nSalário: "+salario);
		System.out.println("\n");
	}
}
