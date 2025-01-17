package TiposVeiculo;

public class Moto extends Veiculo {
    public Moto(double peso) {
        super(peso);
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 100) {
            return 2.00;
        } else if (peso <= 299.9) {
            return 4.00;
        } else {
            return 10.00;
        }
    }
}
