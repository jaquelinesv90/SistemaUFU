package controller;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Sistema da Universidade Federal de Uberl�ndia");
		System.out.println("1 - Cadastro de alunos");
		System.out.println("2 - Cadastro de Refei��es");
		System.out.println("3 - Consulta da Refei��o do dia");
		System.out.println("4 - Consulta das refei��es realizadas na semana por aluno");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma op��o:");
		
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
