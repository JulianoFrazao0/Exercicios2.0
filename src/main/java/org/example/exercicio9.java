package org.example;
import java.util.Scanner;

public class exercicio9 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário do funcionário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Tempo de casa (em anos): ");
        double tempoCasa = sc.nextDouble();

        double percentual = 0.0;

        if (tempoCasa < 1) {
            percentual = 0.0;
        } else if (tempoCasa <= 3) {
            percentual = 0.05; // 5%
        } else if (tempoCasa <= 10) {
            percentual = 0.10; // 10%
        } else {
            percentual = 0.15; // 15%
        }

        double bonus = salario * percentual;
        System.out.println("Percentual de bônus: " + (percentual * 100) + "%");
        System.out.println("Valor do bônus: R$ " + bonus);
    }
}
