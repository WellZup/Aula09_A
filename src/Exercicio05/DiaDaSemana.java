package Exercicio05;
import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String diaDaSemana;

        System.out.println("Digite um numero e diremos que dia da semana é: \n");
        num = entrada.nextInt();


        switch (num) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;

            default:
                diaDaSemana = "Número inválido!";
        }
        System.out.print("Dia da semana de acordo com o número escolhido é: " + diaDaSemana);
    }
}
