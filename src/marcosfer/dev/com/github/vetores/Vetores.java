package marcosfer.dev.com.github.vetores;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nome = new String[5];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
        }

        System.out.print("Clientes cadastrados: ");
        for (int i = 0; i < nome.length; i++) {
            System.out.print(nome[i] + " ");
        }

        sc.close();

    }
}
