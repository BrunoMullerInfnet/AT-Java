package EX8;

class Main{
    public static void main(String[] args) {
        Funcionario f1 = new Estagiario();
        f1.SetNome("Maria");
        f1.SetSalarioBase(1000);

        Funcionario f2 = new Gerente();
        f2.SetNome("Carlos");
        f2.SetSalarioBase(1000);

        System.out.println(f1.GetNome() + " - Salário: " + f1.GetSalarioBase());
        System.out.println(f2.GetNome() + " - Salário: " + f2.GetSalarioBase());
    }
}