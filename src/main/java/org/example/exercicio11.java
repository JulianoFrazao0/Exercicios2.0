package org.example;

import java.util.Scanner;

public class exercicio11 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno no primeiro Bi: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota do aluno no segundo Bi: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota do aluno no terceiro Bi: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a nota do aluno no quarto Bi: ");
        double nota4 = sc.nextDouble();

        System.out.println("Digite a frequncia do aluno: ");
        double frequencia = sc.nextDouble();

        double calculo = nota1 + nota2 +nota3 + nota4 / 4;

        if (calculo <= 7) {
            System.out.println("Aprovado");

        } else if (calculo <= 5) {
            System.out.println("Reprovado");

        }
        System.out.println("sah");
    }
}
