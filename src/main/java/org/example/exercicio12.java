package org.example;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("O saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("limite diario de saque: ");
        double limiteDiario = sc.nextDouble();

        System.out.print("digite o valor que voce quer sacar: ");
        double valorSaque = sc.nextDouble();

        if (saldo < valorSaque) {
            System.out.println("Saldo insuficientre");
        } else {
            if (valorSaque > limiteDiario) {
                System.out.println("nao da para sacar esse valor!");
            } else {
                saldo = saldo - valorSaque;
                System.out.println("Saque realizado");
                System.out.println("novo saldo: " + saldo);
            }
        }
    }
}
