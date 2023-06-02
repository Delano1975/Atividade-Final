public class Banho {

	String simples;
	String completo;
	double precoSimples;
	double precoCompleto;
	Tosa tosa;
	
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
	 void chamarMetodoTosa() {
        if (tosa != null) {
            tosa.metodoDaTosa(); // Chama o método implementado na classe Tosa
        }
    }

    // Método setter para atribuir uma instância da classe Tosa
    void setTosa(Tosa tosa) {
        this.tosa = tosa;
    }
}
