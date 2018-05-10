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
	
	//M�todo para realizar as perguntas
	public void perguntas(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome:").toLowerCase();	
		quantidade++;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));	
	}
	
	//La�o
	public void repeticao(){
		
		//Vari�vel sair
		int continuar = 0;
		
		//La�o
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
	
	//M�todo para verificar maior altura
	public void maiorAltura(){
	if(altura > maltura){
	    maltura = altura;
	    nomealtura = nome;
	} 
	   
	}   
	
	//M�todo para verificar maior idade
	public void maiorIdade() {
	if(idade > midade){
	    midade = idade;
	    nomeidade = nome;
	}
	
	}
	
	//M�todo para verficar maior peso
	public void maiorPeso(){
	if(peso > mpeso){
		mpeso = peso;
		nomepeso = nome;
	}

	}
	
	//M�todo para verificar m�dia das alturas
	public double mediadasAlturas(){
	somaAlturas += altura;
	mediaAlturas = (somaAlturas/quantidade);
		
		return mediaAlturas;
	}
	
	//M�todo para exibir resultado
	public void apresentar(){
		String texto = "*** RESULTADO: ***";
			   texto+= "\nA quantidade de jogadores �: "+quantidade;
	           texto+= "\nNome e altura do maior jogador: "+nomealtura+" , "+maltura;
	           texto+= "\nNome e idade do jogador mais velho: "+nomeidade+" , "+midade;
	           texto+= "\nNome e peso do jogador mais pesado: "+nomepeso+" , "+mpeso;
	           texto+= "\nA m�dia das alturas �: "+mediaAlturas;
	         
	   JOptionPane.showMessageDialog(null, texto); 
	}       
}