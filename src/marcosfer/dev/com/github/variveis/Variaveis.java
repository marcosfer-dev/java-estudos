package marcosfer.dev.com.github.variveis;

import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome =  sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        int altura = sc.nextInt();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.println("Nome: " + nome
                + "\nIdade: " + idade
                + "\nAltura: " + altura + "cm"
                + "\nSalário: " + salario);

        sc.close();

    }
}
