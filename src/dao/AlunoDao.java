package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mensagens.Mensagens;
import model.Aluno;
import connection.ConnectionFactory;

public class AlunoDao {

	public String salvar(Aluno aluno) throws SQLException {
		try {
			String sql = "insert into aluno(nome, cpf, matricula, telefone, curso, periodo)values(?,?,?,?,?,?)";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);
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

	public Aluno pesquisaPorNome(String nome) throws SQLException {
		Aluno aluno = new Aluno();
		try {

			String sql = "select * from aluno a where a.nome like ?";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.setString(1, nome);

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getInt("cpf"));
				aluno.setMatricula(resultado.getInt("matricula"));
				aluno.setTelefone(resultado.getInt("telefone"));
				aluno.setCurso(resultado.getString("curso"));
				aluno.setPeriodo(resultado.getInt("periodo"));
			}
			stmt.close();

			return aluno;

		} catch (Exception e) {
			System.out.println(Mensagens.erroConsultar(e));
			return aluno;
		}
	}

	public Aluno pesquisaPorMatricula(int matricula) {
		Aluno aluno = new Aluno();

		try {
			String sql = "select * from aluno a where a.matricula = ?";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.setInt(1, matricula);

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getInt("cpf"));
				aluno.setMatricula(resultado.getInt("matricula"));
				aluno.setTelefone(resultado.getInt("telefone"));
				aluno.setCurso(resultado.getString("curso"));
				aluno.setPeriodo(resultado.getInt("periodo"));
			}
			stmt.close();

			return aluno;

		} catch (Exception e) {
			System.out.println(Mensagens.erroConsultar(e));
			return aluno;
		}
	}

	public Aluno pesquisaPorCurso(String curso) {
		Aluno aluno = new Aluno();
		try {

			String sql = "select * from aluno a where a.curso like ?";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.setString(1, curso);

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getInt("cpf"));
				aluno.setMatricula(resultado.getInt("matricula"));
				aluno.setTelefone(resultado.getInt("telefone"));
				aluno.setCurso(resultado.getString("curso"));
				aluno.setPeriodo(resultado.getInt("periodo"));
			}
			stmt.close();
			
			return aluno;

		} catch (Exception e) {
			System.out.println(Mensagens.erroConsultar(e));
			return aluno;
		}
	}
}
