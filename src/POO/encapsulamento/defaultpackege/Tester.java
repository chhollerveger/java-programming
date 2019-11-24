package POO.encapsulamento.defaultpackege;

import POO.encapsulamento.dominio.*;

public class Tester {

    public static void main(String[] args) {
        Correntista c = new Correntista("Carlos Henrique Hollerveger", "Rua Q, 360");

        ContaCorrente cc = new ContaCorrente(1903, "c");

        cc.depositar(4500);
        cc.sacar(25);

        System.out.println("Correntista: " + c.getCorrentista());
        System.out.println("Conta Corrente: " + cc.getNumero());
        System.out.println("Saldo Atual: " + cc.getSaldo());
    }
}
