package org.example;
import java.util.Scanner;
public class atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double soma = num1 + num2;
                System.out.println("resultado: " + soma);
                break;

            case 2:
                double subtracao = num1 - num2;
                System.out.println("resultado: " + subtracao);
                break;

            case 3:
                double multiplicacao = num1 * num2;
                System.out.println("rsultado: " + multiplicacao);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("nao e possivel dividir por zero");
                } else {
                    double divisao = num1 / num2;
                    System.out.println("resultado: " + divisao);
                }
                break;

            default:
                System.out.println("invalida");
                break;
        }
    }
}
