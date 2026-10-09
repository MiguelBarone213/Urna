package AAA;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
       
        int eLeitores = Integer.parseInt(JOptionPane.showInputDialog("Quantos Eleitores?"));
        
       
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Candidatos?"));
        
        String nomes[] = new String[quant];
        int votos[] = new int[quant]; 
        
      
        for (int i = 0; i < quant; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nome do Candidato " + (i + 1) + ":");
            votos[i] = 0; 
        }
        
 
        for (int j = 0; j < eLeitores; j++) {
            String menu = "Eleitor " + (j + 1) + ", escolha seu voto:\n";
            for (int i = 0; i < quant; i++) {
                menu += i + " - " + nomes[i] + "\n";
            }
            
            int votoEscolhido = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
          
            if (votoEscolhido >= 0 && votoEscolhido < quant) {
                votos[votoEscolhido]++;
            } else {
                JOptionPane.showMessageDialog(null, "Voto inválido! Computado como nulo.");
            }
        }
        
        
        String resultado = "Resultado da Eleição:\n";
        for (int i = 0; i < quant; i++) {
            resultado += nomes[i] + ": " + votos[i] + " voto(s)\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}