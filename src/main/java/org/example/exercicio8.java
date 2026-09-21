package org.example;
import java.util.Scanner;

public class exercicio8 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("velocidade maxima da via: ");
        double velMax = sc.nextDouble();

        System.out.print("velocidade do veicolo: ");
        double velVeiculo = sc.nextDouble();

        if (velVeiculo <= velMax) {
            System.out.println("Dentro do limite. nao tem multa.");
        } else if (velVeiculo <= (velMax * 1.20)) {
            System.out.println(" media.");
        } else if (velVeiculo <= (velMax * 1.50)) {
            System.out.println(" grave.");
        } else {
            System.out.println(" gravissima.");
        }
    }
}
