package EstruturasDeDados.pilha;

public class Pilha implements IPilha {

    private TAD topo;
    private int numeroDeElementos;

    @Override
    public void empilha(int valor) {
        TAD tad = new TAD(valor);
        TAD auxiliar = null;

        if (topo==null) {
            topo = tad;
        } else {
            auxiliar = topo;
            topo = tad;
            topo.setProximo(auxiliar);
        }
        numeroDeElementos++;
        System.out.println(valor);
    }

    @Override
    public void desempilha() {
        topo = topo.getProximo();
        numeroDeElementos--;
    }

    @Override
    public boolean procura(int valor) {
        return false;
    }

    @Override
    public void ListaElementos() {

    }

    @Override
    public void esvazia() {

    }
}
