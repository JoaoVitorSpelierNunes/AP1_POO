package AP1;

import java.util.Scanner;
public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valProd = scan.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double desc = scan.nextDouble();

        double valDesc = valProd * (desc / 100);
        double preco = valProd - valDesc;

        System.out.printf("Valor do desconto: R$ %.2f%n", valDesc);
        System.out.printf("Preço final do produto: R$ %.2f%n", preco);
    }
    
    
}