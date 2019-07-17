package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import mensagens.Mensagens;
import model.Aluno;

public class AlunoDao{

	public String salvar(Aluno aluno) throws SQLException{
		
		try {
			 String sql = "insert into aluno(nome, cpf, matricula, telefone, curso, periodo)values(?,?,?,?,?,?)";
			   PreparedStatement stmt = ConnectionFactory.getConnectionFactory().prepareStatement(sql);
			   stmt.setString(1, aluno.getNome());
			   stmt.setLong(2, aluno.getCpf());
			   stmt.setLong(3, aluno.getMatricula());
			   stmt.setLong(4, aluno.getTelefone());
			   stmt.setString(5, aluno.getCurso());
			   stmt.setLong(6, aluno.getPeriodo());
			   
			   stmt.execute();
			   stmt.close(); 
			   
			   return Mensagens.salvar();
		} catch (Exception e) {
			return Mensagens.erroSalvar(e);
		}
	}
}
