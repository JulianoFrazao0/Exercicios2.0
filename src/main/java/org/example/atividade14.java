package org.example;
import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o numero do mes (1 a 12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("este mes tem 31 dias.");
                break;

            case 4, 6, 9, 11:
                System.out.println("este mes tem 30 dias.");
                break;

            case 2:
                System.out.println("este mes tem 28 dias.");
                break;

            default:
                System.out.println("Mes invalido! Digite um valor entre 1 e 12.");
                break;
        }
    }
}
