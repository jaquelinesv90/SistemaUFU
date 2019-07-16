package mensagens;

public class Mensagens {
	
	public static String salvar(){
		return "Salvo com sucesso!";
	}

	public static String erroSalvar(Exception e){
		return "Erro ao salvar" + e;
	}
	
}
