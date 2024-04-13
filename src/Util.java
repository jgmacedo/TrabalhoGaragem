import TiposVeiculo.*;

import java.util.Scanner;
public class Util{
    public Util(){
        System.out.println("Bem vindo ao estacionamento do centro");
        System.out.println("Qual o modelo do seu veículo?");
        System.out.println("Digite 1 para carro, 2 para moto, 3 para caminhonete e 4 para furgão");
        Scanner scan = new Scanner(System.in);
        int veiculoTipo = scan.nextInt();

        switch(veiculoTipo) {
            case 1: calcularCarro(); break;
            case 2: calcularMoto(); break;
            case 3: calcularCaminhonete(); break;
            case 4: calcularFurgao(); break;
            default: System.out.println("Opção inválida");
        }
    }
    public void calcularCarro(){
        System.out.println("Qual o tipo do seu carro?");
        System.out.println("Digite 1 para hatchback, 2 para sedan e 3 para SUV");
        Scanner scan1 = new Scanner(System.in);
        int carroTipo = scan1.nextInt();
        String carroTipoString;
        double precoFinal;
        Carro carro = new Carro(carroTipo);

        switch(carroTipo){
            case 1:
                System.out.println("Você pagará " + carro.calcularTarifa() + "reais." );
            case 2:
                System.out.println("Você pagará " + carro.calcularTarifa() + "reais." );
            case 3:
                System.out.println("Você pagará " + carro.calcularTarifa() + "reais." );
            default:
                System.out.println("Não entendi");

        }

    }
    public void calcularMoto(){
        System.out.println("Quanto pesa sua moto?");
        System.out.println("Digite o peso no formato \"xxx\" (sem unidade de medida)");
        Scanner scan1 = new Scanner(System.in);
        Moto moto = new Moto(scan1.nextInt());
        double v = moto.calcularTarifa();
        System.out.println("Você pagará" + v + "reais.");
    }
    public void calcularCaminhonete(){
        System.out.println("Quanto pesa sua Caminhonete?");
        System.out.println("Digite o peso no formato \"x.x\" (em toneladas)");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Sua caminhonete está carregada? Digite true ou false");
        Scanner scan3 = new Scanner(System.in);
        Caminhonete caminhonete = new Caminhonete(scan2.nextInt(),scan3.nextBoolean());
        double v = caminhonete.calcularTarifa();
        System.out.println("Você pagará" + v + "reais.");
    }
    public void calcularFurgao(){
        System.out.println("Quanto pesa seu Furgão?");
        System.out.println("Digite o peso no formato \"x.x\" (em toneladas)");
        Scanner scan2 = new Scanner(System.in);
        double peso = scan2.nextDouble();
        scan2.nextLine(); // consome a quebra de linha pendente

        System.out.println("Seu furgão está carregado? Digite true ou false");
        boolean carregado = scan2.nextBoolean();
        scan2.nextLine(); // consome a quebra de linha pendente

        Furgao furgao = new Furgao(peso, carregado);
        double v = furgao.calcularTarifa();
        System.out.println("Você pagará" + v + "reais.");
    }

}
