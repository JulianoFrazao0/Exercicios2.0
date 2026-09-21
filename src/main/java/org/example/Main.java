package org.example;
import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();




        String vot = "Pode votar";
        String dir = "Pode dirigir";
        String id = "Voce é idoso";
        String id2 = "Voce é velho";
        String id3 = "Voce esta capenga ja";

        if (idade <= 16) {
            System.out.println(vot);

        }
        else if(idade <= 18) {
            System.out.println(dir);
        }
        else if (idade <= 60) {
            System.out.println(id);

        }
        else if (idade >= 65) {
            System.out.println(id);
            System.out.println(id2);
            System.out.println(id3);
        }


    }
}
