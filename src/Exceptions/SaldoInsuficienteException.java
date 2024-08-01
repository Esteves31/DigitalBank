package Exceptions;

public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para transação!");
    }
}
