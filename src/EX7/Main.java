package  EX7;

class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.Matricula = 12345;
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.0;
        aluno.nota3 = 9.0;

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.Matricula);
        System.out.printf("%.2f\n", aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarAprovacao());
    }
}