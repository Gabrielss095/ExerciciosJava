package heranca;

public class pessoaFisica extends Cliente {
	private String nome;
	private String cpf;
	private int idade;
	
	//construtor
	public pessoaFisica(String tipoCliente, String nome, String cpf, int idade)
	{
		super(tipoCliente);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}