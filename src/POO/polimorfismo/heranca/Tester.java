package POO.polimorfismo.heranca;

public class Tester {

    public static void main(String[] args) {

        Funcionario horista = new Horista(1, "Carlos", 0, 176, 22.50);
        horista.calcularSalario();
        System.out.println("Funcionário(a) " + horista.getNome() + " receberá " + horista.getSalario() + " no mês atual.");

        Funcionario comissionado = new Comissionado(2, "Leticia", 2000, 463.87);
        comissionado.calcularSalario();
        System.out.println("Funcionário(a) " + comissionado.getNome() + " receberá " + comissionado.getSalario() + " no mês atual.");
    }
}
