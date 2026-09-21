package org.example;
import java.util.Scanner;

public class exercicio10 {
        public void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("usuario: ");
            String usuario = sc.next();

            System.out.print("Senha: ");
            String senha = sc.next();

            if (usuario.equals("admin")) {
                System.out.println("usuarioa não encontrado.");
            } else {
                if (senha == ("1234")) {
                    System.out.println("acesso liberado.");
                } else {
                    System.out.println("senha incorreta.");
                }
            }
        }
}
