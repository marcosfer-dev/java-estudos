package marcosfer.dev.com.github.estruturadedecisao;

import java.util.Scanner;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Olá " + nome  + "! você é maior de idade.");
        } else {
            System.out.println("Olá " + nome  + "! você é menor de idade.");
        }

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Saque: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque de R$ " + saque + " permitido");
        } else {
            System.out.println("Saldo insuficiente");
        }

        sc.close();
    }
}