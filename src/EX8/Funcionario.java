package EX8;

class Funcionario{
    String nome;
    double salarioBase;

    public double SetSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        return salarioBase;
    }

    public String SetNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public double GetSalarioBase() {
        return salarioBase;
    }

    public String GetNome() {
        return nome;
    }
}