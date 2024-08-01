package Classes;

import Exceptions.SaldoInsuficienteException;

public abstract class Conta {

    private Pessoa usuario;
    private int saldo;

    public Conta(Pessoa novoUsuario) {
        usuario = novoUsuario;
        saldo = 0;
    }

    public void depositar(int valor) {
        saldo += valor;
    }

    public void sacar(int valor) throws SaldoInsuficienteException {
        if (valor > saldo)
            throw new SaldoInsuficienteException();
        else {
            saldo -= valor;
        }
    }

    void transferir(int valor, Conta conta) throws SaldoInsuficienteException {
        if (valor > saldo) 
            throw new SaldoInsuficienteException();
        else {
            saldo -= valor;
            conta.depositar(valor);
        }
    }

    public void donoDaConta() {
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
    }
}