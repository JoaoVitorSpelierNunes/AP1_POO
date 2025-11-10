package AP1;

import java.util.Scanner;
public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] resistencias = new double[4];
        double soma = 0, maior = 0, menor = Double.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = scan.nextDouble();

            soma += resistencias[i];
            if (resistencias[i] > maior) maior = resistencias[i];
            if (resistencias[i] < menor) menor = resistencias[i];
        }

        System.out.printf("Resistência equivalente (série): %.2f Ω%n", soma);
        System.out.printf("Maior resistência: %.2f Ω%n", maior);
        System.out.printf("Menor resistência: %.2f Ω%n", menor);
    }
    
    
}