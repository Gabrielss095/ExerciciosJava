package PacotePOO;

public class Cliente {
//Atributos da classe
	private String nomeCliente;
	private String tipoCliente;
	private String cpf;
	private char genero;
	private int idade;
	
	//Construtores
	public Cliente(String nomeCliente, String tipoCliente, String cpf, char genero, int idade) {
		super();
		this.nomeCliente = nomeCliente;
		this.tipoCliente = tipoCliente;
		this.cpf = cpf;
		this.genero = genero;
		this.idade = idade;
	}

	//Declaração de demais metódos
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void vizualizar()
	{
		System.out.println("Cliente: "+nomeCliente+"\nTipo do Cliente: "+tipoCliente);
	}
	
}
