package exercicios;

import javax.swing.*;

public class Exercicio5 {
	
	//Atributos
	String produto;
	double valor;
	double percentual = 1.00;
	int quantidade = 1;
	
	//Método para obter produto e valor
	public void compra(){
	
	produto = JOptionPane.showInputDialog("Informe o produto desejado:");
	valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor desse produto:"));
	
	}
	
	//Método para apresentar desconto
	public void desconto(){
		
        String tabela = "Você comprou "+produto+" e o custo, conforme a quantidade é: \n\n";

        //Laço
        do{
            percentual-=0.05;
            tabela += valor+" X "+quantidade+" = "+((valor*quantidade)*percentual)+"\n";

            quantidade++;
            

        }while((quantidade >= 1) && (quantidade <= 10)); 

 
        JOptionPane.showMessageDialog(null, tabela);

	}

}
