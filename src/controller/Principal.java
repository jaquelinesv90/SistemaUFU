package controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Aluno;
import model.Refeicao;
import model.Registro;
import enumerador.DiaEnum;

//
public class Principal {

	public static void main(String[] args) throws SQLException {

		System.out.println("Sistema da Universidade Federal de Uberlândia");
		System.out.println("1 - Cadastro de alunos");
		System.out.println("2 - Cadastro de Refeições");
		System.out.println("3 - Consulta da Refeição do dia");
		System.out.println("4 - Consulta Aluno");
		System.out.println("5 - Registrar refeição");
		System.out.println("6 - Consulta das refeições realizadas na semana por aluno");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha uma opção:");

		int opcao = scanner.nextInt();

		Refeicao refeicao;
		Aluno aluno;
		Registro registro;
		
		AlunoController alunoController = new AlunoController();
		RefeicaoController refeicaoController = new RefeicaoController();
		RegistroController registroController = new RegistroController();
		
		switch (opcao) {
		case 1:
			aluno = new Aluno();

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

			alunoController.salvar(aluno);

			break;

		case 2:
			refeicao = new Refeicao();
			
			System.out.println("Digite o Tipo de Arroz");
			refeicao.setTipoArroz(scanner.next());

			System.out.println("Digite o Tipo de Feijão");
			refeicao.setTipoFeijao(scanner.next());

			System.out.println("Digite o Tipo de Carne");
			refeicao.setTipoCarne(scanner.next());

			System.out.println("Digite o Tipo de Salada");
			refeicao.setTipoSalada(scanner.next());

			System.out.println("Escolha o dia da semana");
			System.out.println("1 -Segunda");
			System.out.println("2 -Terça");
			System.out.println("3 -Quarta");
			System.out.println("4 -Quinta");
			System.out.println("5 -Sexta");
			System.out.println("6 -Sábado");
			
			opcao = 0;
			opcao = scanner.nextInt();
			
			if(opcao == 1){
				refeicao.setDiaSemana(DiaEnum.SEGUNDA.getDescricao());
			}
			if(opcao == 2){
				refeicao.setDiaSemana(DiaEnum.TERCA.getDescricao());
			}
			
			if(opcao == 3){
				refeicao.setDiaSemana(DiaEnum.QUARTA.getDescricao());
			}
			
			if(opcao == 4){
				refeicao.setDiaSemana(DiaEnum.QUINTA.getDescricao());
			}
			
			if(opcao == 5){
				refeicao.setDiaSemana(DiaEnum.SEXTA.getDescricao());
			}
			
			if(opcao == 6){
				refeicao.setDiaSemana(DiaEnum.SABADO.getDescricao());
			}

			refeicaoController.salvar(refeicao);

			break;

		case 3:
			String formatter = new SimpleDateFormat("EEEE").format(new Date());
			refeicao = new Refeicao();

			refeicao = refeicaoController.consultaPorDia(formatter);

			System.out.println("Cardápio do dia :"+ formatter);
			System.out.println("Tipo de Arroz: " + refeicao.getTipoArroz());
			System.out.println("Tipo de Feijão: " + refeicao.getTipoFeijao());
			System.out.println("Tipo de Carne: " + refeicao.getTipoCarne());
			System.out.println("Tipo de Salada: " + refeicao.getTipoSalada());

			break;

		case 4:
			aluno = new Aluno();
			
			System.out.println("Selecione o tipo de pesquisa:");
			System.out.println("1 - Nome");
			System.out.println("2 - Matricula");
			System.out.println("3 - Curso");
			opcao = 0;
			opcao = scanner.nextInt();
			if (opcao == 1) {
				System.out.println("Digite o nome completo do aluno");
				aluno = alunoController.pesquisaPorNome(scanner.next());
			}
			if (opcao == 2) {
				System.out.println("Digite a matricula do aluno");
				aluno = alunoController.pesquisaPorMatricula(scanner.nextInt());
			} else if(opcao == 3){
				System.out.println("Digite o curso");
				aluno = alunoController.pesquisaPorCurso(scanner.next());
			}

			System.out.println("Dados do Aluno");
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("Cpf:" + aluno.getCpf());
			System.out.println("Matrícula:" + aluno.getMatricula());
			System.out.println("Telefone:" + aluno.getTelefone());
			System.out.println("Curso:" + aluno.getCurso());
			System.out.println("Período:" + aluno.getPeriodo());
			
			break;
			
		case 5:
			opcao = 0;
			
			registro = new Registro();

			System.out.println("Digite o nome do Aluno");
			registro.setNomeAluno(scanner.next());

			System.out.println("Digite a matrícula");
			registro.setMatricula(scanner.nextInt());
			
			registro.setDiaRefeicao(new Date());
			
			registroController.salvar(registro);
			break;
			
		case 6:
			String nome = "";
			int matricula = 0;
			
			System.out.println("Selecione o tipo de pesquisa:");
			System.out.println("1 - Nome");
			System.out.println("2 - Matricula");
			opcao = 0;
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o nome completo do aluno");
				nome = scanner.next();
			}
			if (opcao == 2) {
				System.out.println("Digite a matricula do aluno");
				matricula = scanner.nextInt();
			}
			alunoController.consultaAlunoPorNome(nome);
			
			break;
		default:
			break;
		}
	}
}