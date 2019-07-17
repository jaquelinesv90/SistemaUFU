package service;

import interfaces.GenericInterface;

import java.sql.SQLException;

import model.Refeicao;
import dao.RefeicaoDao;

public class RefeicaoService  implements GenericInterface {

	RefeicaoDao dao = new RefeicaoDao();
	
	@Override
	public void salvar(Object entidade) throws SQLException {
		String msg = dao.salvar((Refeicao)entidade);
		System.out.println(msg);
		
	}

	public Refeicao consultaPorDia(String dia) throws SQLException{
		return dao.consultaPorDia(dia);
	}
	
}
