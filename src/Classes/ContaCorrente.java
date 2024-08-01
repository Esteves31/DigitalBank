package Classes;

public class ContaCorrente extends Conta {

    private int numAgencia;

    public ContaCorrente(Pessoa novoUsuario, int novoNumAgencia) {
        super(novoUsuario);
        numAgencia = novoNumAgencia;
    }
    
    public int getNumAgencia() {
        return numAgencia;
    }
}
