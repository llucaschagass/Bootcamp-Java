import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite o valor do depósito: ");
            double valor = scanner.nextDouble();

            if (valor > 0) {
                System.out.printf("Depósito realizado com sucesso! Saldo atual: R$ %.2f%n", valor);
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                break; // Encerra o loop
            } else {
                System.out.println("Valor inválido! Digite um valor maior que zero.");
            }
        }
    }
}