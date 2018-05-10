package exercicios;

import javax.swing.*;

public class Exercicio4 {
	
	//Atributos
	String opcao = "Dê sua opinião refente ao filme: \n1) Excelente \n2) Ótimo \n3) Bom \n4)Regular \n5)Ruim";	   
	int voto, votoValido = 0, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0;
	int idade, crianca = 0, adolescente = 0, adulto = 0;
	int perc1 = 0, perc2 = 0, perc3 = 0, perc4 = 0, perc5 = 0;
	
	
	//Obter votos e idades
		public void questoes(){
		
		voto = Integer.parseInt(JOptionPane.showInputDialog(opcao));
		votoValido++;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		
	}
		
	//Laço
	public void repetir(){
	
		int continuar = 0;
		
		do{
			questoes();
			votacao();
			classificacao();
			percentuais();
			continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?", "", 0);
		
		}while(continuar == 0); 
		
		resultado();
	}
	
	//Método para obter totais de cada nota
	public void votacao(){
		if(voto == 1){
		     voto1++;
		}else if(voto == 2){
		     voto2++;
		}else if(voto == 3){
		     voto3++;
		}else if(voto == 4){
		     voto4++;
		}else if(voto == 5){
		     voto5++;
	    }        
	}
	
	//Método para obter classificação das idades
	public void classificacao(){
		if((idade >= 0) && (idade <= 9)){
			crianca++;
		}else if((idade >= 10) && (idade <= 17)){
			adolescente++;
		}else if((idade >= 18) && (idade <=100)){
			adulto++;
		}
		
	}
	
	//Método de cálculo - percentuais de nota
	public void percentuais(){
		
		 perc1 = ((voto1 * 100) / votoValido);
		 perc2 = ((voto2 * 100) / votoValido);
		 perc3 = ((voto3 * 100) / votoValido);
		 perc4 = ((voto4 * 100) / votoValido);
		 perc5 = ((voto5 * 100) / votoValido);
				
	}
	
	//Método para apresentar resultado
	public void resultado(){
		
		String texto = "****RESULTADO****\n\n";
        	   texto+= "\nPercentual de votos Excelente: "+perc1+" %.";
        	   texto+= "\nPercentual de votos Ótimo: "+perc2+" %.";
        	   texto+= "\nPercentual de votos Bom: "+perc3+" %.";
        	   texto+= "\nPercentual de votos Regular: "+perc4+" %.";
        	   texto+= "\nPercentual de votos Ruim: "+perc5+" %.";
        	   texto+= "\nQuantidade de crianças de 0 a 9 anos: "+crianca;
        	   texto+= "\nQuantidade de adolescentes de 10 a 17 anos: "+adolescente;
        	   texto+= "\nQuantidade de adultos de 18 anos acima: "+adulto;


        JOptionPane.showMessageDialog(null, texto);

	}
	
}

	

