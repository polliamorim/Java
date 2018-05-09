package exercicios;

import javax.swing.*;

public class Exercicio1 {
	
	//Atributos 
	String nome;
	String sexo;
	int idade;
	String cargo; 
	
	//Vari�veis
	int masculino = 0, feminino = 0; 
	int gerente = 0, atendente = 0, acougueiro = 0, secretaria = 0, almoxarife = 0, padeiro = 0, estagiario = 0;
	int maior = 0, menor = 0;
	
	//M�todo para realizar as perguntas
		public void perguntas(){
			
			nome = JOptionPane.showInputDialog("Informe seu nome:").toLowerCase();
			sexo = JOptionPane.showInputDialog("Informe seu sexo: Masculino ou Feminino").toLowerCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
			cargo =JOptionPane.showInputDialog("Informe seu cargo dentre: Gerente, Atendente, A�ougueiro,  Secret�ria, Almoxarife, Padeiro , Estagi�rio:").toLowerCase();
		}
		
		//M�todo de repeti��o
		public void laco(){
			
			//Vari�vel sair
			int continuar = 0;
			
			//La�o
			do{
				perguntas();
				contagemSexo();
				contagemIdade();
				contagemCargo();
				continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?", "", 0);
			}while(continuar == 0); 
			
			exibir();
		}
		//M�todo para verificar quantidade de masculino e feminino
		public void contagemSexo(){
			if(sexo.equals("masculino")){
				masculino++;
			}else{
				feminino++;
			}
		}
		
		//M�todo para verificar quantidade de masculino e feminino
		public void contagemCargo(){
			if(cargo.equals("gerente")){
				gerente++;
			}else if(cargo.equals("atendente")){
				atendente++;
			}else if(cargo.equals("a�ougueiro")){
				acougueiro++;
			}else if(cargo.equals("secretaria")){
				secretaria++;
			}else if(cargo.equals("almoxarife")){
				almoxarife++;
			}else if(cargo.equals("padeiro")){
				padeiro++;	
			}else if(cargo.equals("estagiario")){
				estagiario++;	
			}	
		}
		
		//M�todo para verificar idades
		public void contagemIdade(){
			if(idade < 18){
				menor++;
			}else if(idade > 18){
				maior++;
			}
		}
		
		//Exibir mensagem
		public void exibir(){
			String msg = "*** RESULTADO: ***";
				   msg+= "\nQuantidade de pessoas do sexo masculino: "+masculino;
				   msg+= "\nQuantidade de pessoas do sexo feminino: "+feminino;
				   msg+= "\nQuantidade de pessoas que s�o Gerente: "+gerente;
				   msg+= "\nQuantidade de pessoas que s�o Atendente: "+atendente;
				   msg+= "\nQuantidade de pessoas que s�o A�ougueiro: "+acougueiro;
				   msg+= "\nQuantidade de pessoas que s�o Secret�ria: "+secretaria;
				   msg+= "\nQuantidade de pessoas que s�o Almoxarife: "+almoxarife;
				   msg+= "\nQuantidade de pessoas que s�o Padeiro: "+padeiro;
				   msg+= "\nQuantidade de pessoas que s�o Estagi�rio: "+estagiario;
				   msg+= "\nQuantidade de pessoas que s�o menores de 18 anos: "+menor;
				   msg+= "\nQuantidade de pessoas que s�o maiores de 18 anos: "+maior;
				   
				   JOptionPane.showMessageDialog(null, msg);
		}		
}
