package service;

import java.sql.SQLException;

import model.Aluno;
import dao.AlunoDao;
import interfaces.GenericInterface;

public class AlunoService  implements GenericInterface{

	AlunoDao dao = new AlunoDao();
	
	@Override
	public void salvar(Object entidade) throws SQLException {
		dao.salvar((Aluno)entidade);
	}

	@Override
	public boolean excluir() {
		// TODO Auto-generated method stub
		return false;
	}

}
