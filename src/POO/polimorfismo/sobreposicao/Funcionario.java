package POO.polimorfismo.sobreposicao;

public abstract class Funcionario {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
