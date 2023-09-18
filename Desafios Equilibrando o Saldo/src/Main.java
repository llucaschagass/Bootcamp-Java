import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calcula o saldo atualizado
        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

        // Imprime o saldo atualizado com uma casa decimal
        System.out.println("Saldo atualizado na conta: " + String.format("%.1f", saldoAtualizado));
    }
}
