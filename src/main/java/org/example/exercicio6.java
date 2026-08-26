package org.example;
import java.util.Scanner;

public class exercicio6 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double frete;

        if (valorCompra >= 199.00) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        double total = valorCompra + frete;
        System.out.println("Valor do frete: R$ " + frete);
        System.out.println("Total a pagar: R$ " + total);
    }
}
