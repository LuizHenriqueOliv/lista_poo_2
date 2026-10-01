package br.edu.ifpb.questao04;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= 10000 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque inválido.");
        }
    }

    public void depositar(float valor) {
        if (valor > 0 && valor <= 10000) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
