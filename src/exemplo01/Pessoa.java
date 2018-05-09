package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	
	//Atributos
	String nome;
	int idade;
	double peso, altura;
	
	//M�todo de apresenta��o
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Ol�! Meu nome � "+nome);
	}
	
	//C�lculo de IMC
	public double calculoIMC(){
		double imc = peso / Math.pow(altura,2);
		return imc;
	}
	
	//Situa��o do IMC
	public String situacaoIMC(){
		
		//Variavel contendo a situa��o
		String situacao;
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Situa��o
		if(imc < 17){
			situacao =  "Muito abaixo do peso.";
		}else if(imc < 18.5){
			situacao = "Abaixo do peso.";
		}else if(imc < 25){
			situacao = "Peso normal.";
		}else if(imc < 30){
			situacao = "Acima do peso.";
		}else if(imc < 35){
			situacao = "Obesidade I.";
		}else if(imc < 40){
			situacao = "Obesidade II.";
		}else{
			situacao = "Obesidade III";
		}
		
		//Retorno
		return situacao;
		}	
	
	//M�todo para exibir o IMC e a situa��o
	public void exibirIMC(){
		
		//Mensagem
		String msg = "*** IMC ***";
			   msg+= "\nSeu IMC � de: "+String.format("%.2f", calculoIMC());
			   msg+= "\nSua situa��o �: "+situacaoIMC();
			   
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);
		
		}
	}
