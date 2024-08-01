package Classes;

public class ContaPoupanca extends Conta {

    private int numAgencia;

    public ContaPoupanca(Pessoa novoUsuario, int novoNumAgencia) {
        super(novoUsuario);
        numAgencia = novoNumAgencia;
    }
    
    public int getNumAgencia() {
        return numAgencia;
    }
}
