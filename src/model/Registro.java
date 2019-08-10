package model;

import java.util.Date;

public class Registro {
	
	private int idRegistro;
	private String nomeAluno;
	private int matricula;
	private Date diaRefeicao;
	
	public Registro(){
		
	}
		
	public int getIdRegistro() {
		return idRegistro;
	}
	
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno.toUpperCase();
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Date getDiaRefeicao() {
		return diaRefeicao;
	}

	public void setDiaRefeicao(Date diaRefeicao) {
		this.diaRefeicao = diaRefeicao;
	}
}