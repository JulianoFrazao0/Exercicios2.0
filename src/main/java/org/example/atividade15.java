package org.example;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de veiculo (1 - Carro, 2 - Moto): ");
        int tipo = sc.nextInt();

        double tarifa = 0;

        switch (tipo) {
            case 1:
                tarifa = 8.00;
                break;
            case 2:
                tarifa = 5.00;
                break;
            default:
                System.out.println("opcao invalida");
                sc.close();
                return;
        }

        System.out.print("Digite a quantidade de horas: ");
        double horas = sc.nextDouble();

        double valorTotal = horas * tarifa;

        System.out.print("tem cupom de desconto (1 - sim, 2 - nao)? ");
        int cupom = sc.nextInt();

        if (cupom == 1) {
            if (valorTotal >= 50.00) {
                valorTotal = valorTotal * 0.80;
                System.out.println("desconto de 20% aplicado com sucesso");
            } else {
                System.out.println("O cupom e valido apenas para valores a partir de 50,00.");
            }
        }

        if (horas > 12) {
            System.out.println(" permanencia longa");
        }
        if (horas > 24) {
            System.out.println("cobranca de diaria");
        }

        if (horas <= 2) {
            System.out.println("curta");
        } else if (horas <= 6) {
            System.out.println(" media");
        } else {
            System.out.println("longa");
        }

        System.out.println("Valor final a pagar: " + valorTotal);

        sc.close();
    }
}
