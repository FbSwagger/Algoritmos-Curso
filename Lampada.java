package questão1e2;

public class Lampada {
	Boolean ligada;
	
	void desliga() {
		ligada = false;
	}
	
	void liga() {
		ligada = true;
	}
	
	String observa(){
	if(ligada){
	return "ligada";
	}else{
	return "desligada";
	}
	}
}
