package exemplo03;

import javax.swing.JOptionPane;

public class Carro {
	
	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//Método para retornar a posição livre do vetor
	public int posicaoLivre(){
		
		int posicao = 0;
		
		for(int i=0; i<nomeCarro.length; i++){
			if(nomeCarro[i] == null){
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	//Realizar perguntas
	public void perguntas(){
		
		//Obter a posição
		int posicao = posicaoLivre();
		
		nomeCarro[posicao] = JOptionPane.showInputDialog("Informe o carro.");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro."));
	}
	
	//Laço
	public void laco(){
		
		//Variável
		int continuar = 0;
		
		do{
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar == 0);
		
		ordenar();
		exibir();
	}
	
	//Método de ordenação
	public void ordenar(){
		
		//Variáveis
		String nomeMaiorCarro;
		double valorMaiorCarro;
		
		//Laço principal
		for(int i1 = 0; i1 < nomeCarro.length-1; i1++){
			
			//Laço secundário
			for(int i2 = 0; i2 < nomeCarro.length; i2++){
				
				//Condicional
				if(valorCarro[i2] > valorCarro[i1]){
					nomeMaiorCarro = nomeCarro[i1];
					nomeCarro[i1] = nomeCarro[i2];
					nomeCarro[i2] = nomeMaiorCarro;
					
					valorMaiorCarro = valorCarro[i1];
					valorCarro[i1] = valorCarro[i2];
					valorCarro[i2] = valorMaiorCarro;
				}
				
			}
		}
		
	}
	
	//Método para exibir os carros e seus valores ordenados
	public void exibir(){
		String msg = "*** Carros cadastrados: ***";
		
		for(int i = 0; i<nomeCarro.length; i++){
			if(nomeCarro[i] != null){
				msg+= "\n"+nomeCarro[i]+" "+valorCarro[i];
			}
			
		}
		
		//Exibir msg
		JOptionPane.showMessageDialog(null, msg);
	}
}
