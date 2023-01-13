package heranca;

public class funcionario {
	private String nome;
	private int codFunc;
	
	
	public funcionario(String nome, int codFunc)
	{
		this.nome = nome;
		this.codFunc = codFunc;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodFunc() {
		return codFunc;
	}


	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}
	
	
}
