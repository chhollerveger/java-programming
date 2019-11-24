package POO.polimorfismo.heranca;

public class Horista extends Funcionario {

    private double horas;
    private double valorHora;

    public Horista(int codigo, String nome, double salario, double horas, double valorHora) {
        super(codigo, nome, salario);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularSalario() {
        this.salario = horas*valorHora;
    }
}
