package model;

public class Aluno {
	
	private String nome;
	private long cpf;
	private long matricula;
	private long telefone;
	private String curso;
	private long periodo;
	
	public Aluno(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public long getPeriodo() {
		return periodo;
	}

	public void setPeriodo(long periodo) {
		this.periodo = periodo;
	}
}