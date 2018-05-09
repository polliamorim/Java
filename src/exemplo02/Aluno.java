package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {
	
	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0, reprovados = 0;
	
	//M�todo para realizar as perguntas
	public void perguntas(){
		
		nome = JOptionPane.showInputDialog("Informe o nome do aluno.");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));
	}
	
	//M�todo de repeti��o
	public void laco(){
		
		//Vari�vel sair
		int continuar = 0;
		
		//La�o
		do{
			perguntas();
			exibirSituacao();
			contagem();
			continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar?", "", 0);
		}while(continuar == 0);
		
		//Exibir aprovados e reprovados
		exibir();
	}
	
	//M�todo para retornar o c�lculo da m�dia
	public double calculodeMedia(){
		double media = (nota1+nota2+nota3)/3;
		return media;
	}
		
	//M�todo para retornar a situa��o do aluno
	public String situacaoAluno(){
		String situacao = calculodeMedia()>= 7 ? "Aprovado":"Reprovado";
		return situacao;
	}
	
	//Exibir m�dia e situa��o
	public void exibirSituacao(){
		
		//Mensagem
		String msg = "*** Informa��es do aluno ***";
			   msg+= "\nSua m�dia � "+String.format("%.2f", calculodeMedia());
			   msg+= "\nSua situa��o � "+situacaoAluno();
			   
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);
	}
	
	//Contar aprovados e reprovados
	public void contagem(){
		if(calculodeMedia() >=7){
			aprovados++;
		}else{
			reprovados++;
		}
	}
	
	//Exibir a quantidade de aprovados e reprovados
	public void exibir(){
		
		//Mensagem
		String msg = "*** Aprovados x Reprovados ***";
			   msg+= "\nAlunos aprovados: "+aprovados;
			   msg+= "\nAlunos reprovados: "+reprovados;
			   
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, msg);   
			   
	}
	
}
