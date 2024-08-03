import Cliente.Cliente;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Contas.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro");
        Conta contaCorrente = new ContaCorrente(pedro);
        Conta contaPoupanca = new ContaPoupanca(pedro);

        contaCorrente.depositar(15000);
        contaCorrente.transferir(1500, contaPoupanca);
        contaCorrente.sacar(100);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
