public class Cliente {
    String nome;
	String cpf;
	String ativo;
	String inativo;
	
	void dadosDoCliente () {

		System.out.println("Nome do cliente: " + nome);
		System.out.println("Cpf do clinete: " + cpf);
		
	}
	
	void statusDoCliente () {

		System.out.println("Status do Cliente: " + ativo);
		System.out.println("Status do Cliente: " + inativo);
	}

    void clienteAtivo () {

		System.out.println("Status do Cliente: " + ativo);
	}
}	
