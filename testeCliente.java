package heranca;

public class testeCliente {

	public static void main(String[] args)
	{
		Cliente empresa1 = new pessoaJuridica("Juridico", "IBM", "Eirele");
		Cliente joao = new pessoaFisica("Pessoa Fisica", "João", "444.444.444-22", 27);
		
		System.out.println(empresa1.getTipoCliente());
		System.out.println(joao.getTipoCliente());
	}
	
	
}
