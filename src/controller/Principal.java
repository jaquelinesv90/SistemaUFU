package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Aluno;
import model.Refeicao;
import service.AlunoService;
import service.RefeicaoService;

//
public class Principal {

	public static void main(String[] args) throws SQLException {

		System.out.println("Sistema da Universidade Federal de Uberlândia");
		System.out.println("1 - Cadastro de alunos");
		System.out.println("2 - Cadastro de Refeições");
		System.out.println("3 - Consulta da Refeição do dia");
		System.out.println("4 - Consulta Aluno");
		System.out
				.println("5 - Consulta das refeições realizadas na semana por aluno");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma opção:");

		int opcao = scanner.nextInt();

		Refeicao refeicao = new Refeicao();

		AlunoService alunoService = new AlunoService();
		RefeicaoService refeicaoService = new RefeicaoService();

		switch (opcao) {
		case 1:
			Aluno aluno = new Aluno();

			System.out.println("Digite o nome do Aluno");
			aluno.setNome(scanner.next());

			System.out.println("Digite o Cpf");
			aluno.setCpf(scanner.nextInt());

			System.out.println("Digite a matrícula");
			aluno.setMatricula(scanner.nextInt());

			System.out.println("Digite o telefone");
			aluno.setTelefone(scanner.nextInt());

			System.out.println("Digite o curso");
			aluno.setCurso(scanner.next());

			System.out.println("Digite o período");
			aluno.setPeriodo(scanner.nextInt());

			alunoService.salvar(aluno);

			break;

		case 2:

			System.out.println("Digite o Tipo de Arroz");
			refeicao.setTipoArroz(scanner.next());

			System.out.println("Digite o Tipo de Feijão");
			refeicao.setTipoFeijao(scanner.next());

			System.out.println("Digite o Tipo de Carne");
			refeicao.setTipoCarne(scanner.next());

			System.out.println("Digite o Tipo de Salada");
			refeicao.setTipoSalada(scanner.next());

			System.out.println("Digite o dia da semana");
			refeicao.setDiaSemana(scanner.next());

			refeicaoService.salvar(refeicao);

			break;

		case 3:
			String formatter = new SimpleDateFormat("EEEE").format(new Date());
			System.out.print(formatter);

			refeicao = new Refeicao();

			refeicao = refeicaoService.consultaPorDia(formatter);

			System.out.println("Cardápio do dia");
			System.out.println("Tipo de Arroz:" + refeicao.getTipoArroz());
			System.out.println("Tipo de Feijão:" + refeicao.getTipoFeijao());
			System.out.println("Tipo de Carne:" + refeicao.getTipoCarne());
			System.out.println("Tipo de Salada:" + refeicao.getTipoSalada());

			break;

		case 4:
			System.out.println("Selecione o tipo de pesquisa:");
			System.out.println("1 - Nome");
			System.out.println("2 - Matricula");
			System.out.println("3 - Curso");
			opcao = 0;
			opcao = scanner.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o nome completo do aluno");
				alunoService.pesquisaPorNome(scanner.next());
			}
			if (opcao == 2) {
				System.out.println("Digite a matricula do aluno");
				alunoService.pesquisaPorMatricula(scanner.nextInt());
			} else {
				System.out.println("Escolha entre os cursos");
				System.out.println("Ciência da Computação");
				System.out.println("Sistemas da informação");
				System.out.println("Engenharia da computação");
				System.out.println("Analise e Desenvolvimento de sistemas");
				System.out.println("Digite o curso");

				System.out.println("Digite o curso");
				alunoService.pesquisaPorCurso(scanner.next());
			}

			break;
		default:
			break;
		}
	}
}