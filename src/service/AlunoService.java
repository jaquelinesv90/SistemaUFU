package service;

import interfaces.GenericInterface;

import java.sql.SQLException;

import model.Aluno;
import dao.AlunoDao;

public class AlunoService  implements GenericInterface{

	AlunoDao dao = new AlunoDao();
	
	@Override
	public void salvar(Object entidade) throws SQLException {
		String msg = dao.salvar((Aluno)entidade);
		System.out.println(msg);
	}
	
	public Aluno pesquisaPorNome(String nome)throws SQLException{
		return dao.pesquisaPorNome(nome);
	}

	public Aluno pesquisaPorMatricula(int matricula)throws SQLException{
		return dao.pesquisaPorMatricula(matricula);
	}
	
	public Aluno pesquisaPorCurso(String curso)throws SQLException{
		return dao.pesquisaPorCurso(curso);
	}
}
