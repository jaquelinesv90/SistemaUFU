package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Registro;
import service.AlunoService;
import service.RegistroService;

public class AlunoController {
	
	AlunoService alunoService = new AlunoService();
	RegistroService registroService = new RegistroService();

	public void salvar(Object entidade) throws SQLException {
		alunoService.salvar(entidade);
	}
	
	public Aluno pesquisaPorNome(String nome)throws SQLException{
		return alunoService.pesquisaPorNome(nome);
	}

	public Aluno pesquisaPorMatricula(int matricula)throws SQLException{
		return alunoService.pesquisaPorMatricula(matricula);
	}
	
	public Aluno pesquisaPorCurso(String curso)throws SQLException{
		return alunoService.pesquisaPorCurso(curso);
	}
	
	public void consultaAlunoPorNome(String nome){
		
		List<Registro> listaRegistros = new ArrayList<>();
		listaRegistros = registroService.consultaAlunoPorNome(nome);
		
		for(int i = 0; i<listaRegistros.size();i++){
			for(Registro reg : listaRegistros){
				System.out.println(reg.getNomeAluno());
				System.out.println(reg.getMatricula());
				System.out.println(reg.getDiaRefeicao());
			}
		}
		
	}
	
}
