package marcosfer.dev.com.github.metodos;

public class Metodos {
    public static void main(String[] args) {
        String nomeUsuario = "Fulano";
        double saldoUsuario = 4496.16;

        mostrarNome(nomeUsuario);

        String mensagem = mostrarBoasVindas();
        System.out.println(mensagem);

        mostrarSaldo(4496.16);

        mostrarResumo(nomeUsuario, saldoUsuario);
    }

    public static String mostrarBoasVindas() {
        return "Seja Bem-Vindo";
    }

    public static void mostrarNome(String nome) {
        System.out.println("Olá " + nome);
    }

    public static void mostrarSaldo(double saldo) {
        System.out.println("Saldo: " + saldo);
    }

    public static void mostrarResumo(String nome, double saldo) {
        System.out.println("\n--- RESUMO DA CONTA ---");
        System.out.println("Cliente: " + nome);
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("-----------------------");
    }
}