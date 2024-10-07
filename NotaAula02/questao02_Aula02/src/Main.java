//Elabore um sistema que deverá calcular o valor final de uma corrida de um Uber com base na
//distância percorrida, no tempo de espera e na tarifa base do serviço. O cálculo do valor também
//deve considerar um fator de demanda que aumenta o preço em horários de pico.
//Atributos:
//• distancia (double): Distância percorrida em quilômetros.
//• tempoEspera (int): Tempo de espera em minutos.
//• tarifaBase (double): Valor cobrado pela corrida.
//• fatorDemanda (double): Valor do preço em horários de alta demanda
//Métodos:
//• calcularValorCorrida():
//Calcula o valor da corrida com base na fórmula:
//ValorFinal = (distancia x 2) + (tempoEspera x 0.5) + tarifaBase x fatorDemanda
//• exibirDetalhesCorrida():
//Exibe o valor final da corrida e os detalhes (distância, tempo de espera, tarifa base, fator de demanda).
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Uber corridaUber = new Uber();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Uberah");
        System.out.println("Para onde iremos hoje?");
        System.out.println("Digite a distancia em Km: ");
        corridaUber.distancia=sc.nextDouble();
        System.out.println("Digite o tempo de espera em min: ");
        corridaUber.tempoEspera=sc.nextInt();
        System.out.println(("Digite a tarifa base: "));
        corridaUber.tarifaBase=sc.nextDouble();
        System.out.println(("Digite o fator Demanda: "));
        corridaUber.fatorDemanda=sc.nextDouble();

        corridaUber.calcularValorCorrida();

        corridaUber.exibirDetalhesCorrida();

        sc.close();

    }
}