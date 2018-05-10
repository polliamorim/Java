package exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {
	
	//Atributos
	String nome;
	String sexo;
	Double nota1, nota2, nota3, nota4;
	Double media = 0.00;
	int md10 = 0, md9 = 0, md8 = 0, md7 = 0, md6, md5 = 0;
	int fem = 0, mas = 0;
	int quantiNotas = 0, quantiSexo = 0, quantiNome = 0;
	int perc1, perc2, perc3, perc4, perc5, perc6, perc7, perc8;
	
	//Método para obter dados
	public void dados(){
			
		nome = JOptionPane.showInputDialog("Informe seu nome ou sair para finalizar:");
		while(!nome.equals("sair")){
		quantiNome++;	
		sexo = JOptionPane.showInputDialog("Informe seu sexo - feminino ou masculino:");
		quantiSexo++;
		quantSexo();
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota:"));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota:"));
		quantiNotas++;
		media();
		percentuais();
		
		nome = JOptionPane.showInputDialog("Informe seu nome ou sair para finalizar:");
		}
		exibir();
	}

	
	//Método para obter a média
	public void media(){
		
	media = (nota1+nota2+nota3+nota4)/4;
	
	if(media == 10){
        md10++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Parabéns!");
    }else if((media >= 9) && (media < 10)){
        md9++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Ótimo!");
    }else if((media >= 8) && (media < 9)){
        md8++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Bom!");
    }else if((media >= 7) && (media < 8)){
        md7++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Satisfatório!");
    }else if((media >= 5) && (media < 7)){
        md6++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Recuperação!");
    }else if(media < 5){
        md5++;
        JOptionPane.showMessageDialog(null, "Sua média é "+media+" .Reprovado!");
        } 
	}
	
	//Método para obter quantidades de feminino e masculino
	public void quantSexo(){
		
		if(sexo.equals("feminino")){
			fem++;
		}else{
			mas++;
		}
	}
	
	//Método para obter percentuais de médias e sexo
	public void percentuais(){
		
	perc1 = ((mas * 100) / quantiSexo);
    perc2 = ((fem * 100) / quantiSexo);
    perc3 = ((md10 * 100) / quantiNotas);
    perc4 = ((md9 * 100) / quantiNotas);
    perc5 = ((md8 * 100) / quantiNotas);
    perc6 = ((md7 * 100) / quantiNotas);
    perc7 = ((md6 * 100) / quantiNotas);
    perc8 = ((md5 * 100) / quantiNotas);
    
	}
	
	//Método para apresentar resultado
	public void exibir(){
		
			if(quantiNome >= 1){
		
		
		String texto = "Quantidade e percentural de:\n\n";
        texto+= "\nHomens: "+mas+" , "+perc1+" %.";
        texto+= "\nMulheres: "+fem+" , "+perc2+" %.";
        texto+= "\nAlunos que tiraram 10: "+md10+" , "+perc3+" %.";
        texto+= "\nAlunos que tiraram entre 9 e 9.9: "+md9+" , "+perc4+" %.";
        texto+= "\nAlunos que tiraram entre 8 e 8.9: "+md8+" , "+perc5+" %.";
        texto+= "\nAlunos que tiraram entre 7 e 7.9: "+md7+" , "+perc6+" %.";
        texto+= "\nAlunos que tiraram entre 5 e 6.9: "+md6+" , "+perc7+" %.";
        texto+= "\nAlunos que tiraram abaixo de 5: "+md5+" , "+perc8+" %.";
        
        JOptionPane.showMessageDialog(null, texto);   
		}
	}

}


