package interfaces;

import java.sql.SQLException;

public interface GenericInterface {
	
	public void salvar(Object entidade) throws SQLException;
	
	public boolean excluir();

}
