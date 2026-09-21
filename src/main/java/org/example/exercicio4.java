package org.example;
import java.util.Scanner;

public class exercicio4 {
    public void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("digite o segundo numero: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("A verifaicacao nao pode ser feita (divisao por zero).");
        } else {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " e multiplo de " + num2);
            } else {
                System.out.println(num1 + " nao e multipo de  " + num2);
            }
        }
    }
}
