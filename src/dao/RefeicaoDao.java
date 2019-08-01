package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mensagens.Mensagens;
import model.Refeicao;
import connection.ConnectionFactory;

public class RefeicaoDao {

	public String salvar(Refeicao refeicao) throws SQLException {

		try {
			String sql = "insert into refeicao(tipoArroz,tipoFeijao,tipoCarne,tipoSalada,diaSemana)values(?,?,?,?,?)";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);
			stmt.setString(1, refeicao.getTipoArroz());
			stmt.setString(2, refeicao.getTipoFeijao());
			stmt.setString(3, refeicao.getTipoCarne());
			stmt.setString(4, refeicao.getTipoSalada());
			stmt.setString(5, refeicao.getDiaSemana());

			stmt.execute();
			stmt.close();

			return Mensagens.salvar();
		} catch (Exception e) {
			return Mensagens.erroSalvar(e);
		}
	}

	public Refeicao consultaPorDia(String dia) throws SQLException {
		Refeicao refeicao = new Refeicao();
		try {

			String sql = "select * from refeicao r where r.diaSemana = ?";
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);

			stmt.setString(1, dia);

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				refeicao.setTipoArroz(resultado.getString("tipoArroz"));
				refeicao.setTipoFeijao(resultado.getString("tipoFeijao"));
				refeicao.setTipoCarne(resultado.getString("tipoCarne"));
				refeicao.setTipoSalada(resultado.getString("tipoSalada"));
				refeicao.setDiaSemana(resultado.getString("diaSemana"));
			}

			stmt.close();

		} catch (Exception e) {
			System.out.println(Mensagens.erroConsultar(e));
		}
		return refeicao;
	}
}