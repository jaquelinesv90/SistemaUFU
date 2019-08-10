package service;

import interfaces.GenericInterface;

import java.sql.SQLException;
import java.util.List;

import model.Registro;
import dao.RegistroDao;

public class RegistroService implements GenericInterface {

	RegistroDao dao = new RegistroDao();
	
	@Override
	public void salvar(Object entidade) throws SQLException {
		dao.salvar((Registro)entidade);
	}

	public List<Registro> consultaAlunoPorNome(String nome){
		return dao.consultaAlunoPorNome(nome);
	}
}
