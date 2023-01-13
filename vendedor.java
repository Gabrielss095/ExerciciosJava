package heranca;

public class vendedor extends funcionario {
	private String tipoFunc1, local;
	
	public vendedor(String tipoFunc1, String local, String nome, int codFunc)
	{
		super(nome, codFunc);
		this.tipoFunc1 = tipoFunc1;
		this.local = local;
	}

	public String getTipoFunc1() {
		return tipoFunc1;
	}

	public void setTipoFunc1(String tipoFunc1) {
		this.tipoFunc1 = tipoFunc1;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
