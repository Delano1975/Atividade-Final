public class Tosa {
   
    String simples;
	String completa;
	double precoSimples;
	double precoCompleto;
	
	void tipoDeTosa () {
		
		System.out.println("Tosa simples: " + simples);
		System.out.println("Tosa completa: " + completa);
		
	}
	
	void tipoDePreco () {

		System.out.println("Preço simples: " + precoSimples);
		System.out.println("Preço completo: " + precoCompleto);
				
		Cliente cliente = new Cliente();
	
	     cliente.ativo = "Delano Gadelha";

	}

	void agendarBanhoETosa(String data) {
        	System.out.println("Agendando banho e tosa para a data: " + data);
        	Banho banho = new Banho();
        	banho.tipoDeBanho();
	}
}


