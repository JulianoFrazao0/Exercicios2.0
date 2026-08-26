package org.example;
import java.util.Scanner;

public class exercicio10 {
        public void main (String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Usuário: ");
            String usuario = sc.next();

            System.out.print("Senha: ");
            String senha = sc.next();

            if (!usuario.equals("admin")) {
                System.out.println("Usuário não encontrado.");
            } else {
                if (senha.equals("java123")) {
                    System.out.println("Acesso liberado.");
                } else {
                    System.out.println("Senha incorreta.");
                }
            }
        }
}
