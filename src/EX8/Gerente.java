package EX8;

public class Gerente extends Funcionario {
    @Override
    public double GetSalarioBase() {
        return salarioBase * 1.2;
    }
}