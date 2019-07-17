package controller;

import java.sql.SQLException;
import java.util.Scanner;

import service.AlunoService;
import model.Aluno;

public class Principal {
	
	public static void main(String[] args) throws SQLException {
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
			Aluno aluno = new Aluno();
			AlunoService alunoService = new AlunoService();
			
			aluno.setNome("Jaqueline");
			aluno.setCpf(12333);
			aluno.setMatricula(12345);
			aluno.setTelefone(66789999);
			aluno.setCurso("Computação");
			aluno.setPeriodo(1);
			
			alunoService.salvar(aluno);
			
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
