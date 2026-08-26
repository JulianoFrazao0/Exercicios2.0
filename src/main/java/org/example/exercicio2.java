package org.example;
import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();


        if (num > 0) {
            System.out.println("O numero é positivo!");
        }

        if (num % 2 == 0) {
            System.out.println("O numero é par!");
        }

        if (num % 5 == 0) {
            System.out.println("O numero é multipo de 5!");
        }

        int modulo = Math.abs(num);
        if (modulo >= 10 && modulo <= 99) {
            System.out.println("Tem dois dígitos");
        }

        sc.close();
    }
}