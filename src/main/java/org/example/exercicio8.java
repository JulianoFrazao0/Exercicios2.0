package org.example;
import java.util.Scanner;

public class exercicio8 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Velocidade máxima da via: ");
        double velMax = sc.nextDouble();

        System.out.print("Velocidade do veículo: ");
        double velVeiculo = sc.nextDouble();

        if (velVeiculo <= velMax) {
            System.out.println("Dentro do limite. Não há multa.");
        } else if (velVeiculo <= (velMax * 1.20)) {
            System.out.println("Infração média.");
        } else if (velVeiculo <= (velMax * 1.50)) {
            System.out.println("Infração grave.");
        } else {
            System.out.println("Infração gravíssima.");
        }
    }
}
