package br.com.generation;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Instanciação do Objeto Funcionario
		Funcionário funcionario1 = new Funcionário();
		Funcionário funcionario2 = new Funcionário();
		Funcionário funcionario3 = new Funcionário();
		
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
		
		System.out.println("Nome do funcionário: " + funcionario1.nome);
		System.out.println("Matrícula: " + funcionario1.matricula);
		System.out.println("Horário de entrada: " + funcionario1.horario + "h");
		
		System.out.println();
		
		System.out.println("Nome do funcionário: " + funcionario2.nome);
		System.out.println("Matrícula: " + funcionario2.matricula);
		System.out.println("Horário de entrada: " + funcionario2.horario + "h");
		
		System.out.println();
		
		System.out.println("Nome do funcionário: " + funcionario3.nome);
		System.out.println("Matrícula: " + funcionario3.matricula);
		System.out.println("Horário de entrada: " + funcionario3.horario + "h");
		
		
		
		
		
		
		
		

	}

}
