package controller;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Sistema da Universidade Federal de Uberlândia");
		System.out.println("1 - Cadastro de alunos");
		System.out.println("2 - Cadastro de Refeições");
		System.out.println("3 - Consulta da Refeição do dia");
		System.out.println("4 - Consulta das refeições realizadas na semana por aluno");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			AlunoController aluno = new AlunoController();
			
			break;
		
		case 2:
			
			break;
	
		case 3:
	
			break;
			
		case 4:
			
			break;
		default:
			break;
		}
		
	}

}
