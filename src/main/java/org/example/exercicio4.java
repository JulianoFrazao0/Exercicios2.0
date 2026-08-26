package org.example;
import java.util.Scanner;

public class exercicio4 {
    public void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("A verificação não pode ser feita (divisão por zero).");
        } else {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " é múltiplo de " + num2);
            } else {
                System.out.println(num1 + " NÃO é múltiplo de " + num2);
            }
        }
    }
}
