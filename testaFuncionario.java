package heranca;

public class testaFuncionario {

	public static void main(String[] args) {
		funcionario joao = new gerente("Pinheiros", " João dos Santos", "Autorização-total", "Gerente", 808);
		funcionario guilherme = new vendedor("Vendedor", "Pinheiros", "Guilherme da Silva", 28);
		

		System.out.println("Nome: "+joao.getNome()+"\nCod Funcionario: "+joao.getCodFunc());
		System.out.println("\n-----------------------------------------------\n");
		System.out.println("Nome: "+guilherme.getNome()+"\nCod Funcionario: "+guilherme.getCodFunc());
	}

}
