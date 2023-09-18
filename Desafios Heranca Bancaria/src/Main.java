import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        String titular, numeroContaStr;
        double saldo, taxaJuros;

        try (Scanner scanner = new Scanner(System.in)) {
            titular = scanner.nextLine();
            numeroContaStr = scanner.nextLine();
            saldo = Double.parseDouble(scanner.nextLine());
            taxaJuros = Double.parseDouble(scanner.nextLine());
        }

        int numeroConta = Integer.parseInt(numeroContaStr);

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
