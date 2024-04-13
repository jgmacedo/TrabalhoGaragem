package TiposVeiculo;
public class Caminhonete extends Veiculo {
    private boolean carregada;

    public Caminhonete(double peso, boolean carregada) {
        super(peso);
        this.carregada = carregada;
    }

    @Override
    public double calcularTarifa() {
        if (peso <= 3) {
            return 25.00;
        } else if (peso <= 6 && carregada) {
            return 50.00;
        } else {
            return 0;
        }
    }
}
