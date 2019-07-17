package service;

import java.sql.SQLException;

import model.Aluno;
import dao.AlunoDao;
import interfaces.GenericInterface;

public class AlunoService  implements GenericInterface{

	AlunoDao dao = new AlunoDao();
	
	@Override
	public void salvar(Object entidade) throws SQLException {
		String msg = dao.salvar((Aluno)entidade);
		System.out.println(msg);
	}

}
