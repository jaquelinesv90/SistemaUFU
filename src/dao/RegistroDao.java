package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mensagens.Mensagens;
import model.Registro;
import connection.ConnectionFactory;

public class RegistroDao {
	
	public void salvar(Registro registro){
		try {
			String sql = "insert into registro(nomeAluno, matricula, diaRefeicao )values(?,?,?)";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);
			stmt.setString(1, registro.getNomeAluno());
			stmt.setInt(2, registro.getMatricula());
			stmt.setDate(3, (Date) registro.getDiaRefeicao());

			stmt.execute();
			stmt.close();
			
			System.out.print(Mensagens.salvar());
		} catch (Exception e) {
			System.out.print(Mensagens.erroSalvar(e));
		}
	}
	
	
	public List<Registro> consultaAlunoPorNome(String nome){
		List<Registro> listRegistro = new ArrayList<>();
		
		try {
			String sql = "";

			sql = "select * from registro r  where r.nomeAluno like '%" + nome
					+ "%'";

			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.execute();

			ResultSet resultado = stmt.executeQuery();

			while (resultado.next()) {
				Registro reg = new Registro();
				reg.setIdRegistro(resultado.getInt("idRegistro"));
				reg.setNomeAluno(resultado.getString("nomeAluno"));
				reg.setMatricula(resultado.getInt("matricula"));
				reg.setDiaRefeicao(resultado.getDate("diaRefeicao"));

				listRegistro.add(reg);
			}

			stmt.close();

		} catch (Exception e) {
			System.out.print(Mensagens.erroConsultar(e));
		}
		return listRegistro;
	}
	
	public List<Registro> consultaAlunoPorMatricula(int matricula) {

		List<Registro> listRegistro = new ArrayList<>();

		try {
			String sql = "";

			sql = "select * from registro r  where r.matricula = " + matricula;

			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.execute();

			ResultSet resultado = stmt.executeQuery();

			while (resultado.next()) {
				Registro reg = new Registro();
				reg.setIdRegistro(resultado.getInt("idRegistro"));
				reg.setNomeAluno(resultado.getString("nomeAluno"));
				reg.setMatricula(resultado.getInt("matricula"));
				reg.setDiaRefeicao(resultado.getDate("diaRefeicao"));

				listRegistro.add(reg);
			}

			stmt.close();

		} catch (Exception e) {
			System.out.print(Mensagens.erroConsultar(e));
		}
		return listRegistro;

	}
	
}
