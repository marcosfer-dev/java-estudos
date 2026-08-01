package marcosfer.dev.com.github.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Nome completo: ");
            String nomeCompleto = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Cidade: ");
            String cidade = sc.nextLine();

            System.out.print("Profissão: ");
            String profissao = sc.nextLine();

            System.out.print("Salário mensal: ");
            double salario = sc.nextDouble();

            System.out.println("==========================");
            System.out.println("CADASTRO");
            System.out.println("==========================");
            System.out.println("Nome: " + nomeCompleto
            + "\nIdade: " + idade
            + "\nCidade: " + cidade
            + "\nProfissão: " + profissao
            + "\nSalário: " + salario);
            System.out.println("==========================");

        sc.close();

    }
}
