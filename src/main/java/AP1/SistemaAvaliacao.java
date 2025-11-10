package AP1;

import javax.swing.JOptionPane;
public class SistemaAvaliacao {
    public static void main(String[] args) {
        double prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova:"));
        double prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova:"));
        double trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho:"));

        double media = (prova1 + prova2 + trabalho) / 3;

        String situacao = media >= 6 ? "Aprovado" : "Reprovado";

        JOptionPane.showMessageDialog(null, 
            String.format("Média: %.2f%nSituação: %s", media, situacao));
    }
    
    
}