package marcosfer.dev.com.github.estruturaderepeticao;

import java.util.Scanner;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int numeroEscolhido = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            int resultado = numeroEscolhido * i;
            System.out.printf("%d * %d = %2d \n", numeroEscolhido, i, resultado);
        }

        sc.close();
    }
}