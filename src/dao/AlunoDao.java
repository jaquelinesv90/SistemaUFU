package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import mensagens.Mensagens;
import model.Aluno;

public class AlunoDao{

	public String salvar(Aluno aluno) throws SQLException{
		
		try {
			 String sql = "insert into tabela(coluna1, coluna2, coluna3)values(?,?,?)";
			   PreparedStatement stmt = ConnectionFactory.getConnectionFactory().prepareStatement(sql);
			   stmt.setString(1, "parametro1");
			   stmt.setString(2, "parametro2");
			   stmt.setString(3, "parametro3");
			   stmt.execute();
			   stmt.close(); 
			   
			   return Mensagens.salvar();
		} catch (Exception e) {
			return Mensagens.erroSalvar(e);
		}
	}
}
