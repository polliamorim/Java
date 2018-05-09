package exemplo01;

public class Principal {
	
	public static void main(String [] args){
		
		//Instanciar
		Pessoa p1 = new Pessoa();
		p1.nome = "Andressa";
		p1.idade = 28;
		p1.peso = 85;
		p1.altura = 1.76;
		
		//Instanciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.nome = "Caio";
		p2.idade = 23;
		p2.peso = 60;
		p2.altura = 1.57;
		
		//Invocar métodos
		p1.apresentacao();
		p1.exibirIMC();
		
		
	}

}
