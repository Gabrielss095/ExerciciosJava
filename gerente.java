package heranca;

public class gerente extends funcionario{
	private String loja, autorizado, tipoFunc;
	
	public gerente(String loja, String nome, String autorizado, String tipoFunc, int codFunc)
	{
		super(nome, codFunc);
		this.loja = loja;
		this.tipoFunc = tipoFunc;
		this.autorizado = autorizado;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}
	
	public String getTipoFunc() {
		return tipoFunc;
	}
	public void setTipoFunc() {
		this.tipoFunc = tipoFunc;
	}
	
	public String getAutorizado() {
		return autorizado;
	}
	
	public void setAutorizado(String autorizado) {
		this.autorizado = autorizado;
	}
	
	
}
