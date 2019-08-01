package controller;

import java.sql.SQLException;

import service.RefeicaoService;
import model.Refeicao;

public class RefeicaoController {
	
	RefeicaoService refeicaoService = new RefeicaoService();


	public void salvar(Object entidade) throws SQLException {
		refeicaoService.salvar((Refeicao) entidade);
	}

	public Refeicao consultaPorDia(String dia) throws SQLException {
		return refeicaoService.consultaPorDia(dia);
	}

}
