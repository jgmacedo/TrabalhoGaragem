package TiposVeiculo;

public class Carro extends Veiculo {
    public int tipo;

    public Carro(int tipo){
        this.tipo = tipo;
    }

    @Override
    public double calcularTarifa() {
        return switch (tipo) {
            case 1 -> 13.00;
            case 2 -> 15.00;
            case 3 -> 20.00;
            default -> 0;
        };
    }
}