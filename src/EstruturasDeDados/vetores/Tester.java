package EstruturasDeDados.vetores;

public class Tester {

    public static void main(String[] args) {

        Aluno[] vetorDeInteiros = new Aluno[3];

        vetorDeInteiros[0] = new Aluno(1, "Carlos");
        vetorDeInteiros[1] = new Aluno(1, "Leticia");
        vetorDeInteiros[2] = new Aluno(1, "Henrique");

        for(int i = 0; i < vetorDeInteiros.length; i++)
            System.out.println(vetorDeInteiros[i]);
    }
}
