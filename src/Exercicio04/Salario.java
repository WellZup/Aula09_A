package Exercicio04;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, percentual, aumento ,novoSalario = 0;

        System.out.println("A Zup quer dar um aumento de salário aos seus zuppers.");
        System.out.println("Pedimos que nos informe o seu salário para o calculo do aumento: \n");
        salario = entrada.nextDouble();

        if (salario <= 280) {
            percentual = 0.2;
        } else if (salario <= 700) {
            percentual = 0.15;
        } else if (salario <= 1500) {
            percentual = 0.1;
        } else {
            percentual = 0.05;
        }

        aumento = salario * percentual;
        novoSalario = salario + aumento;

        System.out.println("||----Salário antes do reajuste: R$" + salario +"----||");
        System.out.println("||---------------------------------------||");
        System.out.println("||----Percentual de aumento aplicado: " + (percentual * 100) + "%" +"----||");
        System.out.println("||---------------------------------------||");
        System.out.println("||----Valor do aumento: R$" + aumento +"----||");
        System.out.println("||---------------------------------------||");
        System.out.println("||----Novo salário após o aumento: R$" + novoSalario +"----||");
    }
}
