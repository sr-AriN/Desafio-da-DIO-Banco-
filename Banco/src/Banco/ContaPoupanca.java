package Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("===\tExtrato Conta Poupança\t ===");
        super.imprimirInfosComuns();

    }
}
