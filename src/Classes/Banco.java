package Classes;

import java.util.List;

public class Banco {
    
    private List<ContaCorrente> contasCorrente;
    private List<ContaPoupanca> contasPoupanca;

    public void adicionarContaCorrente(ContaCorrente novaConta) {
        contasCorrente.add(novaConta);
    }

    public void adicionarContaPoupanca(ContaPoupanca novaConta) {
        contasPoupanca.add(novaConta);
    }

    public List<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }
}
