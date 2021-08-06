package br.com.generation;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Instanciação do Objeto Cliente
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		cliente1.nome = "Thales";
		cliente1.idade = 23;
		cliente1.rg = 256520145;
		cliente1.cpf = 32695847;		
		
		
		cliente2.nome = "Marte";
		cliente2.idade = 21;
		cliente2.rg = 41527485;
		cliente2.cpf = 2147589;
		
		cliente3.nome = "Maria";
		cliente3.idade = 25;
		cliente3.rg = 52458574;
		cliente3.cpf = 45214785;
		
		cliente1.comprarProduto();
		
		System.out.println("Nome do cliente que comprou Geladeira Brastemp: " + cliente1.nome);
		System.out.println("Idade:" + cliente1.idade);
		System.out.println("RG:" + cliente1.rg);
		System.out.println("CPF:" + cliente1.cpf);
		
		
	    System.out.println();
	    
	    System.out.println("Nome do cliente que comprou Fogão Consul: " + cliente2.nome);
	    System.out.println("Idade:" + cliente2.idade);
	    System.out.println("RG:" + cliente2.rg);
	    System.out.println("CPF:" + cliente2.cpf);
	    
	    System.out.println();
	    
	    System.out.println("Nome do cliente que comprou Microondas LG: " + cliente3.nome);
	    System.out.println("Idade:" + cliente3.idade);
	    System.out.println("RG:" + cliente3.rg);
	    System.out.println("CPF: " + cliente3.cpf);
	    
	
 	}
}
