package controller;

import java.sql.SQLException;

import model.Aluno;
import service.AlunoService;

public class AlunoController {
	
	AlunoService alunoService = new AlunoService();

	public void salvar(Object entidade) throws SQLException {
		alunoService.salvar(entidade);
	}
	
	public Aluno pesquisaPorNome(String nome)throws SQLException{
		return alunoService.pesquisaPorNome(nome);
	}

	public Aluno pesquisaPorMatricula(int matricula)throws SQLException{
		return alunoService.pesquisaPorMatricula(matricula);
	}
	
	public Aluno pesquisaPorCurso(String curso)throws SQLException{
		return alunoService.pesquisaPorCurso(curso);
	}
}
