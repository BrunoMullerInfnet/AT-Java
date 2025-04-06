package EX7;

class Aluno{
    String nome;
    int Matricula;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao(){
        if(calcularMedia() >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}