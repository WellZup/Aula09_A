package Exercicio02;
import java.util.Scanner;
public class Produto_mais_barato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double produto1 = 0;
        double produto2 = 0;
        double produto3 = 0;
        double maisBarato;

        System.out.println("Comparação de preço de produtos.");
        System.out.println("Digite o valor de 3 produtos a sua escolha: \n");

        System.out.println("Valor do Produto número 1: ");
        produto1 = entrada.nextDouble();
        System.out.println("Valor do Produto número 2: ");
        produto2 = entrada.nextDouble();
        System.out.println("Valor do Produto número 3: ");
        produto3 = entrada.nextDouble();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.printf("Este é o mais barato, com o valor de: R$%.2f%n", produto1);

        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.printf("Este é o mais barato, com o valor de: R$%.2f%n", produto2);
        } else {
            System.out.printf("Este é o mais barato, com o valor de: R$%.2f%n", produto3);
        }

    }

    }

