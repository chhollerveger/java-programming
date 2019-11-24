package POO.encapsulamento.dominio;
import POO.encapsulamento.dominio.Correntista;

public class ContaCorrente {

    private String correntista;
    private double saldo;
    private int numero;

    public ContaCorrente(int nro, String corr) {
        numero = nro;
        correntista = corr;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (existeSaldo(valor) == true)
            saldo = saldo - valor;
    }

    private boolean existeSaldo(double valor) {
        if (valor <= saldo )
            return true;
        else
            return false;
    }
}
