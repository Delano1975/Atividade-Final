public class Banho {

	String simples;
	String completo;
	double precoSimples;
	double precoCompleto;
	
	void tipoDeBanho () {

		System.out.println("Banho simples: " + simples);
		System.out.println("Banho completo: " + completo);
				
	}

	void tipoDePreco () {

		System.out.println("Preço simples: " + precoSimples);
		System.out.println("Preço completo: " + precoCompleto);
				
	}
	void exibirDetalhes() {
        
		System.out.println("Detalhes do banho:");
		System.out.println("Simples: " + simples);
		System.out.println("Completo: " + completo);
		System.out.println("Preço simples: " + precoSimples);
		System.out.println("Preço completo: " + precoCompleto);
	}
}
