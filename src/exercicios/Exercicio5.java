package exercicios;

import javax.swing.*;

public class Exercicio5 {
	
	//Atributos
	String produto;
	double valor;
	double percentual = 1.00;
	int quantidade = 1;
	
	//M�todo para obter produto e valor
	public void compra(){
	
	produto = JOptionPane.showInputDialog("Informe o produto desejado:");
	valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor desse produto:"));
	
	}
	
	//M�todo para apresentar desconto
	public void desconto(){
		
        String tabela = "Voc� comprou "+produto+" e o custo, conforme a quantidade �: \n\n";

        //La�o
        do{
            percentual-=0.05;
            tabela += valor+" X "+quantidade+" = "+((valor*quantidade)*percentual)+"\n";

            quantidade++;
            

        }while((quantidade >= 1) && (quantidade <= 10)); 

 
        JOptionPane.showMessageDialog(null, tabela);

	}

}
