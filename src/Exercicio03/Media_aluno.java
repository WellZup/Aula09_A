package Exercicio03;
import java.util.Scanner;
public class Media_aluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2 = 0;
        float media;

        System.out.println("Vamos verificar se o aluno está aprovado.");
        System.out.println("Digite a primeira nota: \n");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a primeira nota: \n");
        nota2 = entrada.nextFloat();

        media = (nota1 + nota2) /2;

        if( (media == 10)  ){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }

}
