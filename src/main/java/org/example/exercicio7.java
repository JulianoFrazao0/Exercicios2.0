package org.example;
import java.util.Scanner;

public class exercicio7 {
    public void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida.");
        } else if (hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora <= 17) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
