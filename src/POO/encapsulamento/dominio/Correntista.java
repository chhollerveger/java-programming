package POO.encapsulamento.dominio;

public class Correntista {

    private String nome, endereco;

    public Correntista (String corr, String end) {
        endereco = end;
        nome = corr;
    }

    public String getCorrentista() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String end) {
        endereco = end;
    }
}
