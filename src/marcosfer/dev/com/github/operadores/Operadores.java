package marcosfer.dev.com.github.operadores;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idadeAtual = sc.nextInt();
            int idadeEm10 = idadeAtual + 10;

            System.out.print("Salário: ");
            double salarioMensal = sc.nextDouble();
            double salarioAnual = salarioMensal * 12;

            System.out.println("==========================");
            System.out.println("RELATÓRIO");
            System.out.println("==========================");
            System.out.println("Nome: " + nome
            + "\nIdade atual: " + idadeAtual
            + "\nIdade em 10 anos: " + idadeEm10
            + "\nSalário mensal: " + salarioMensal
            + "\nSalário anual: " + salarioAnual);
            System.out.println("==========================");


        sc.close();
    }
}