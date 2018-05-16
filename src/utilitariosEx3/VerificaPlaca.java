package utilitariosEx3;

public class VerificaPlaca {
	
	public String  verificarPlaca(String placa){
			
		if(placa.length() == 7){
				
			for(int x = 0; x < 3; x++){	
				
				if((placa.charAt(x) != '0') && (placa.charAt(x) != '1') && (placa.charAt(x) != '2') &&
				   (placa.charAt(x) != '3') && (placa.charAt(x) != '4') && (placa.charAt(x) != '5') && 
				   (placa.charAt(x) != '6') && (placa.charAt(x) != '7') && (placa.charAt(x) != '8') &&
				   (placa.charAt(x) != '9')){
						
				}else {
					
					return "inválida.";
					
				}
				
			}
			
			for(int y = 3; y <= 6; y++) {
				
				if((placa.charAt(y) == '0') || (placa.charAt(y) == '1') || (placa.charAt(y) == '2') ||
				   (placa.charAt(y) == '3') || (placa.charAt(y) == '4') || (placa.charAt(y) == '5') || 
				   (placa.charAt(y) == '6') || (placa.charAt(y) == '7') || (placa.charAt(y) == '8') ||
				   (placa.charAt(y) == '9')) {
					
				}else {
					
					return "inválida.";
					
				}
				
			}
			
			return "válida.";
			
		}else{
			
			return "inválida.";
		
		}
		
	}

}
