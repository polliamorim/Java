package exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	//Atributos
	String nome;
	int idade;
	double altura;
	double peso;
	
	
	//Variaveis
	int quantidade = 0;
	String nomealtura = " ", nomeidade = " ", nomepeso = " ";
	double maltura = 0.00, mpeso = 0.00, somaAlturas = 0.00, mediaAlturas = 0.00;
	int midade = 0;
	
	//Método para realizar as perguntas
	public void perguntas(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome:").toLowerCase();	
		quantidade++;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));	
	}
	
	//Laço
	public void repeticao(){
		
		//Variável sair
		int continuar = 0;
		
		//Laço
		do{
			perguntas();
			maiorAltura();
			maiorIdade();
			maiorPeso();
			mediadasAlturas();
			continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?", "", 0);
		}while(continuar == 0); 
		
		apresentar();
	}
	
	//Método para verificar maior altura
	public void maiorAltura(){
	if(altura > maltura){
	    maltura = altura;
	    nomealtura = nome;
	} 
	   
	}   
	
	//Método para verificar maior idade
	public void maiorIdade() {
	if(idade > midade){
	    midade = idade;
	    nomeidade = nome;
	}
	
	}
	
	//Método para verficar maior peso
	public void maiorPeso(){
	if(peso > mpeso){
		mpeso = peso;
		nomepeso = nome;
	}

	}
	
	//Método para verificar média das alturas
	public double mediadasAlturas(){
	somaAlturas += altura;
	mediaAlturas = (somaAlturas/quantidade);
		
		return mediaAlturas;
	}
	
	//Método para exibir resultado
	public void apresentar(){
		String texto = "*** RESULTADO: ***";
			   texto+= "\nA quantidade de jogadores é: "+quantidade;
	           texto+= "\nNome e altura do maior jogador: "+nomealtura+" , "+maltura;
	           texto+= "\nNome e idade do jogador mais velho: "+nomeidade+" , "+midade;
	           texto+= "\nNome e peso do jogador mais pesado: "+nomepeso+" , "+mpeso;
	           texto+= "\nA média das alturas é: "+mediaAlturas;
	         
	   JOptionPane.showMessageDialog(null, texto); 
	}       
}