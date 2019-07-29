package mensagens;

public class Mensagens {
	
	public static String salvar(){
		return "Salvo com sucesso!";
	}

	public static String erroSalvar(Exception e){
		return "Erro ao salvar" + e;
	}
	
	public static String erroConsultar(Exception e){
		return "Erro ao consultar" + e;
	}

	public static String naoEncontrado(Exception e){
		return "Informações não encontradas!" + e;
	}
	
}
