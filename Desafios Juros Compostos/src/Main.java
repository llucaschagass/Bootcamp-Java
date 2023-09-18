import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        // Iterar para cada ano e calcular o valor final com juros compostos
        for (int ano = 1; ano <= periodo; ano++) {
            valorFinal += valorFinal * taxaJuros;
        }

        DecimalFormat df = new DecimalFormat("#.00"); // Formato para duas casas decimais

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}