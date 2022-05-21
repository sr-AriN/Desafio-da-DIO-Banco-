package Banco;

public class Main {
    public static void main(String[] args) {

        Cliente venom = new Cliente();
        venom.setNome("Venom");

        Conta cc = new ContaCorrente(venom);
        Conta cp = new ContaPoupanca(venom);
        cc.depositar(100);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
