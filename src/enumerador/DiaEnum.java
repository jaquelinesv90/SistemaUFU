package enumerador;

public enum DiaEnum {
	
		SEGUNDA("Segunda-feira"), TERCA("Terca-feira"), QUARTA("Quarta-feira"),
			QUINTA("Quinta-feira"), SEXTA("Sexta-feira"),SABADO("Sabado");
		
		public String descricao;
		
		DiaEnum(String descricao){
			this.descricao = descricao;
		}
		
		public String getDescricao(){
			return descricao;
		}
}
