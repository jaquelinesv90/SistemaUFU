package dao;

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
			stmt.setString(3, registro.getDiaRefeicao());

			stmt.execute();
			stmt.close();
			
			System.out.print(Mensagens.salvar());
		} catch (Exception e) {
			System.out.print(Mensagens.erroSalvar(e));
		}
	}
	
	
	public List<Registro> consultarRegistros(Registro registro){
		List<Registro> listRegistro = new ArrayList<>();
		
		try {
			String sql= "";
			
			if(!registro.getNomeAluno().equals("")){
				 sql = "select * from registro r  where r.nomeAluno like ?";
			}else{
				 sql = "select * from registro r  where r.matricula =  ?";
			}
			
			PreparedStatement stmt = ConnectionFactory.getConnectionFactory()
					.prepareStatement(sql);
			
			if(!registro.getNomeAluno().equals("")){
				stmt.setString(1, registro.getNomeAluno());
			}else{
				stmt.setInt(1, registro.getMatricula());
			}	
			
			stmt.execute();
			
			 ResultSet resultado = stmt.executeQuery();
			 
			  while(resultado.next()){
				  Registro reg = new Registro();
				  reg.setIdRegistro(resultado.getInt("idRegistro"));
				  reg.setNomeAluno(resultado.getString("nomeAluno"));		
				  reg.setMatricula(resultado.getInt("matricula"));
				  reg.setDiaRefeicao(resultado.getString("diaRefeicao"));
				  
				  listRegistro.add(reg);
			  }
			   		   
			stmt.close();

		} catch (Exception e) {
			System.out.print(Mensagens.erroConsultar(e));
		}
		return listRegistro;
	}
}
