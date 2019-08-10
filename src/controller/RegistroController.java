package controller;

import java.sql.SQLException;

import model.Registro;
import service.RegistroService;

public class RegistroController {
	
	RegistroService registroService = new RegistroService();
	
	public void salvar(Object entidade) throws SQLException {
		registroService.salvar((Registro)entidade);
	}

	
}
