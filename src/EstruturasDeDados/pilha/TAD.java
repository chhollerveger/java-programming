package EstruturasDeDados.pilha;

public class TAD {

    private TAD proximo;
    private int valor;

    public TAD(int valor) {
        this.valor = valor;
    }

    public TAD getProximo() {
        return proximo;
    }

    public void setProximo(TAD proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
