package br.com.generation;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Instancia��o do Objeto Funcionario
		Funcion�rio funcionario1 = new Funcion�rio();
		Funcion�rio funcionario2 = new Funcion�rio();
		Funcion�rio funcionario3 = new Funcion�rio();
		
		funcionario1.nome = "Marcio";
		funcionario1.matricula = 3654;
		funcionario1.horario = 10;
		
		funcionario2.nome = "Luiz";
		funcionario2.matricula = 1452;
		funcionario2.horario = 11;
		
		funcionario3.nome = "Julia"; 
		funcionario3.matricula = 4125;
		funcionario3.horario = 13;
		
		funcionario1.baterPonto();
		
		System.out.println("Nome do funcion�rio: " + funcionario1.nome);
		System.out.println("Matr�cula: " + funcionario1.matricula);
		System.out.println("Hor�rio de entrada: " + funcionario1.horario + "h");
		
		System.out.println();
		
		System.out.println("Nome do funcion�rio: " + funcionario2.nome);
		System.out.println("Matr�cula: " + funcionario2.matricula);
		System.out.println("Hor�rio de entrada: " + funcionario2.horario + "h");
		
		System.out.println();
		
		System.out.println("Nome do funcion�rio: " + funcionario3.nome);
		System.out.println("Matr�cula: " + funcionario3.matricula);
		System.out.println("Hor�rio de entrada: " + funcionario3.horario + "h");
		
		
		
		
		
		
		
		

	}

}
