package EX6;
public class Main {
    public static void main(String[] args){
        Veiculo uno = new Veiculo();

        uno.placa = "HTTP777";
        uno.modelo = "Fiat UNO";
        uno.anoFabricacao = 2020;
        uno.quilometragem = 200;
        uno.ExibirDetalhes();

        Veiculo fusca = new Veiculo();

        fusca.placa = "GOOD543";
        fusca.modelo = "Volkswagen Fusca";
        fusca.anoFabricacao = 2020;
        fusca.quilometragem = 200;
        fusca.ExibirDetalhes();
    }
}