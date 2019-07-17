package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Aluno;
import model.Refeicao;
import service.AlunoService;
import service.RefeicaoService;

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
		
		Refeicao refeicao = new Refeicao();
		RefeicaoService refeicaoService = new RefeicaoService();
		
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
			refeicao.setTipoArroz("parboilizado");
			refeicao.setTipoFeijao("carioca");
			refeicao.setTipoCarne("frango assado");
			refeicao.setTipoSalada("alface");
			refeicao.setDiaSemana("Segunda-feira");
			
			refeicaoService.salvar(refeicao);
			
			break;
	
		case 3:
			String formatter = new SimpleDateFormat("EEEE").format(new Date());
			System.out.print(formatter);
			
			refeicao = new Refeicao();
			
			refeicao = refeicaoService.consultaPorDia(formatter);
			
			System.out.println("Cardápio do dia");
			System.out.println("Tipo de Arroz:" + refeicao.getTipoArroz());
			System.out.println("Tipo de Feijão:"+ refeicao.getTipoFeijao());
			System.out.println("Tipo de Carne:"+ refeicao.getTipoCarne());
			System.out.println("Tipo de Salada:"+ refeicao.getTipoSalada());
			
			break;
			
		case 4:
			
			break;
		default:
			break;
		}
	}
}