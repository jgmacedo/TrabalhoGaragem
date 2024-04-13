package TiposVeiculo;

public class Furgao extends Veiculo {
    private boolean carregado;

    public Furgao(double peso, boolean carregado) {
        super(peso);
        this.carregado = carregado;
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 3) {
            return 25.00;
        } else if (peso <= 6 && carregado) {
            return 50.00;
        } else {
            return 0;
        }
    }
}
