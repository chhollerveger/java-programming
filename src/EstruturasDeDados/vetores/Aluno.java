package EstruturasDeDados.vetores;

public class Aluno {

    private int codigoDeMatricula;
    private String nome;

    public Aluno(int codigoDeMatricula, String nome) {
        this.codigoDeMatricula = codigoDeMatricula;
        this.nome = nome;
    }

    public int getCodigoDeMatricula() {
        return codigoDeMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigoDeMatricula=" + codigoDeMatricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
