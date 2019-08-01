package model;

public class Registro {
	
	private int idRegistro;
	private String nomeAluno;
	private int matricula;
	private String diaRefeicao;
	
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
		this.nomeAluno = nomeAluno;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDiaRefeicao() {
		return diaRefeicao;
	}
	public void setDiaRefeicao(String diaRefeicao) {
		this.diaRefeicao = diaRefeicao;
	}
}