package AP1;

import javax.swing.JOptionPane;
public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTrans = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de transação do imóvel:"));
        double valorVen = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor venal do imóvel:"));
        double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do ITBI:"));

        double calc = Math.max(valorTrans, valorVen);
        double imposto = calc * (porcentagem / 100);

        JOptionPane.showMessageDialog(null, 
            String.format("Base de cálculo: R$ %.2f%nImposto ITBI: R$ %.2f", calc, imposto));
    } 
}