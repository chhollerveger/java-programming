package POO.polimorfismo.heranca;

public class Funcionario extends CalculadorDeSalario {

    protected int codigo;
    protected String nome;
    protected double salario;

    public Funcionario(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void calcularSalario() {

    }
}
