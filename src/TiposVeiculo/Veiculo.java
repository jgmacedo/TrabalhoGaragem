package TiposVeiculo;

public abstract class Veiculo {
    protected double peso;
    protected double volume; // Aplicável apenas para alguns veículos

    public Veiculo(double peso) {
        this.peso = peso;
    }

    public Veiculo(double peso, double volume) {
        this.peso = peso;
        this.volume = volume;
    }

    protected Veiculo() {
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }

    // Método abstrato para calcular tarifa, será implementado nas subclasses
    public abstract double calcularTarifa();
}
