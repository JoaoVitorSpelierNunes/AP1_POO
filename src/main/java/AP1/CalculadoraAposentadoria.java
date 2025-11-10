package AP1;

import java.util.Scanner;
public class CalculadoraAposentadoria {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Informe seu sexo (M/F): ");
        char sexo = scan.next().toUpperCase().charAt(0);

        System.out.print("Informe seus anos de contribuição: ");
        int contribuicao = scan.nextInt();

        boolean podeAposentar = false;
        int faltam = 0;

        if (sexo == 'M') {
            if (idade >= 65 || contribuicao >= 35) {
                podeAposentar = true;
            } else {
                faltam = Math.min(65 - idade, 35 - contribuicao);
            }
        } else if (sexo == 'F') {
            if (idade >= 62 || contribuicao >= 30) {
                podeAposentar = true;
            } else {
                faltam = Math.min(62 - idade, 30 - contribuicao);
            }
        }

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar!");
        } else {
            System.out.println("Ainda faltam " + faltam + " anos para se aposentar.");
        }
    }
    
    
}