package org.example;
import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();


        if (num > 0) {
            System.out.println("O numero e positivo");
        }

        if (num % 2 == 0) {
            System.out.println("O numero e par");
        }

        if (num % 5 == 0) {
            System.out.println("O numero e multipo de 5");
        }

    }
}