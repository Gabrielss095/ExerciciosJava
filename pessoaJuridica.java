package heranca;

public class pessoaJuridica extends Cliente {
	private String nomeEmpresa;
	private String tipoCnpj;
	
	public pessoaJuridica(String tipoCliente, String nomeEmpresa, String tipoCnpj)
	{
		super(tipoCliente);
		this.nomeEmpresa = nomeEmpresa;
		this.tipoCnpj = tipoCnpj;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getTipoCnpj() {
		return tipoCnpj;
	}

	public void setTipoCnpj(String tipoCnpj) {
		this.tipoCnpj = tipoCnpj;
	}
	
	public void visualizar() {
		System.out.println(nomeEmpresa+ ""+ tipoCnpj);
	}
}
