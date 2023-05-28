package Exercicio01;
import java.util.Scanner;
public class Qual_o_maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Faremos a comparação com dois números, para ver qual o maior.");
        System.out.println("Digite o primeiro número: ");
        a = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        b = entrada.nextInt();

                if (a > b){
                System.out.println("Número " + a + " maior que " + b + ".");
                } else {
                    System.out.println("Número " + b + " maior que " + a + ".");
               }


    }
}
