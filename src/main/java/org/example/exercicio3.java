package org.example;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura (em graus Celsius): ");
        double temp = sc.nextDouble();

        System.out.print("Digite a umidade relativa do ar (em %): ");
        double umidade = sc.nextDouble();

        if (temp >= 38) {
            System.out.println("Alerta: muito calor");
        }

        if (umidade < 30) {
            System.out.println("Alerta: umidade baixa");
        }

        if (temp >= 35 && umidade < 20) {
            System.out.println("Alerta: queimada");
        }
    }
}
