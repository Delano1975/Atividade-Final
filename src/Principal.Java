public class Principal {

	public static void main(String[] args) {
	
		Tosa tosa = new Tosa ();
		
		tosa.completa = "Pêlo e corte de unhas";
		tosa.simples = "Apenas pêlo";
		
		tosa.tipoDeTosa();
		
		
		Banho banho = new Banho ();
		
		banho.completo = "Shampoo, condicionador e perfume ";
		banho.simples = "Shampoo";
		
		banho.tipoDeBanho();
		
		Cliente cliente = new Cliente ();
		
		cliente.cpf = "123.456.789 -00";
		cliente.nome = "José Gomes";
		
		cliente.dadosDoCliente();
		
		Fornecedor f = new Fornecedor();
		f.razaoSocial = "Pets felizes";
		f.cnpj = "07.954.605/0001-60"; 
		
		f.dadosDoFornecedor();