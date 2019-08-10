package model;

public class Refeicao {
	
	private int idRefeicao;
	private String tipoArroz;
	private String tipoFeijao;
	private String tipoCarne;
	private String tipoSalada;
	private String diaSemana;
	
	public Refeicao(){
		
	}

	public String getTipoArroz() {
		return tipoArroz;
	}

	public void setTipoArroz(String tipoArroz) {
		this.tipoArroz = tipoArroz.toUpperCase();
	}

	public String getTipoFeijao() {
		return tipoFeijao;
	}

	public void setTipoFeijao(String tipoFeijao) {
		this.tipoFeijao = tipoFeijao.toUpperCase();
	}

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne.toUpperCase();
	}

	public String getTipoSalada() {
		return tipoSalada;
	}

	public void setTipoSalada(String tipoSalada) {
		this.tipoSalada = tipoSalada.toUpperCase();
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana.toUpperCase();
	}

	public int getIdRefeicao() {
		return idRefeicao;
	}

	public void setIdRefeicao(int idRefeicao) {
		this.idRefeicao = idRefeicao;
	}
}
