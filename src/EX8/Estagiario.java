package EX8;

public class Estagiario extends Funcionario {
    @Override
    public double GetSalarioBase() {
        return salarioBase * 0.9;
    }
}