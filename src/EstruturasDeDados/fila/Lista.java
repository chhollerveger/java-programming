package EstruturasDeDados.fila;

public class Lista implements ILista {

    private TAD topo, base;
    private int numeroElementos;


    @Override
    public void adicionar(int valor) {
        TAD tad = new TAD(valor);
        if (base==null) {
            base = tad;
            topo = tad;
        } else {
            topo.setProximo(tad);
            topo = tad;
        }
        numeroElementos++;
    }

    @Override
    public void remover() {
        base = base.getProximo();
        numeroElementos--;

    }

    @Override
    public boolean procurar(int valor) {
        return false;
    }

    @Override
    public void listar() {

    }

    @Override
    public void esvaziar() {

    }


}
