package PacotePOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario1 = new Funcionario("Jose da Silva", 'M', "Atendente", 1250.00, "Manha");
		Funcionario funcionario2 = new Funcionario("Antonio Pereira", 'M', "Ajudante Geral", 1800.00, "Manha");
		Funcionario funcionario3 = new Funcionario("Claudia Santana", 'F', "Gerente", 3200.00, "Tarde");
		Funcionario funcionario4 = new Funcionario("Beatriz Costa", 'F', "Sub-Gerente", 2500.00, "Manha");
		
		funcionario1.vizualizarDados();
		funcionario2.vizualizarDados();
		funcionario3.vizualizarDados();
		funcionario4.vizualizarDados();
	}

}
