
public class Uber {
    double distancia;
    int tempoEspera;
    double tarifaBase;
    double fatorDemanda;
    double ValorFinal;

    public void calcularValorCorrida() {
        ValorFinal = (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
    }

    public void exibirDetalhesCorrida() {
        System.out.println("-----------------------------------------");
        System.out.println("           Detalhes da corrida           ");
        System.out.println("-----------------------------------------");
        System.out.println("Valor final: R$ " + ValorFinal);
        System.out.println("Distância Total Percorrida: " + distancia);
        System.out.println("Tempo de Espera: " + tempoEspera);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Fator demanda: " + fatorDemanda);
        System.out.println("-----------------------------------------");
        System.out.println("Obrigada por usar nosso Sistema! Até a próxima!");
        System.out.println("-----------------------------------------");
    }
}
