package utilitarios;

public class VerificaEnsalamento {
	
	public String verificarEnsalamento(String nome, String curso) {
		
		if(curso.equals("CTI")) {
			
			return "22";
			
		}else if(curso.equals("CTA")) {
			
			return "21";
			
		}else if(curso.equals("CTAgro")) {
			
			char primeiraLetra = nome.charAt(0);
			
			if(primeiraLetra >= 'A' && primeiraLetra <='K') {
				
				return "11";
				
			}else if(primeiraLetra >='L' && primeiraLetra <='N'){
				
				return "12";
				
			}else if(primeiraLetra >='O' && primeiraLetra <='Z') {
				
				return "13";
			
			}else {
				
				return "Sala inválida!";
				
			}
			
		}else {
			
			return "Sala inválida!";
			
		}
		
		
		
	}

}
