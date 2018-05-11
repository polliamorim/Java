package exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	//Atributos
	String menu = "Escolha o menu:\n 1)Hamb�rguer e suco de laranja\n 2)Sandu�che natural e suco de uva\n 3) Prato do dia\n 4) Pizza\n 5) Lasanha\n 6) P�o de queijo\n 7) Bolo";
	int codigo;
	int quantidade;
	
	//Vari�veis  
    double total = 0.00;
    double troco = 0.00;       
	
	
	//M�todo para obter pedido
	public void pedido(){
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog(menu));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
	}
	
	//M�todo para repeticao
	public void laco(){
		
		int continuar = 0;
		do{
			pedido();
			valorPedido();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja pedir mais algum item?");
			
		}while(continuar == 0);
		
		finalizarPedido();
	}
	
	//M�todo para calcular total do pedido
	public void valorPedido(){

		if(codigo == 1){
	            total += quantidade * 5.00;   
	        }else if(codigo == 2){		
	            total += quantidade * 4.50;
	        }else if(codigo == 3){
	            total += quantidade * 8.00;
	        }else if(codigo == 4){
	            total += quantidade * 12.00;
	        }else if(codigo == 5){
	            total += quantidade * 16.50;
	        }else if(codigo == 6){
	            total += quantidade * 1.00;
	        }else if(codigo == 7){
	            total += quantidade * 2.50;
	        }
	}
	
	//M�todo para obter troco
	public void finalizarPedido(){
	
	troco = Double.parseDouble(JOptionPane.showInputDialog("O total de seu pedido � R$ "+total+" .Informe o valor dado como pagamento:"));
	
	while(troco < total){
		troco = Double.parseDouble(JOptionPane.showInputDialog("O total de seu pedido � R$ "+total+" .Informe o valor dado como pagamento."));
	        }

	        JOptionPane.showMessageDialog(null, "Seu troco � R$ "+(troco-total)+" .");
	}
}
