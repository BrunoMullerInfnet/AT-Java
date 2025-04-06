package EX6;

public class Veiculo {
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    public void ExibirDetalhes(){
        System.out.printf("Modelo: %s\nPlaca: %s\nAno de fabricação: %d\nQuilometragem: %.2f\n",
                modelo, placa, anoFabricacao, quilometragem);
    }

    public double registrarViagem(double km){
        return quilometragem += km;
    }
}