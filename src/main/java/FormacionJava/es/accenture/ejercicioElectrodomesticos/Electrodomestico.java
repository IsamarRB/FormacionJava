package FormacionJava.es.accenture.ejercicioElectrodomesticos;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    // Constructores
    public Electrodomestico() {}

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(Electrodomestico e) {
        this.tipo = e.tipo;
        this.marca = e.marca;
        this.potencia = e.potencia;
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPotencia() { return potencia; }
    public void setPotencia(double potencia) { this.potencia = potencia; }

    // Métodos
    public double getConsumo(int horas) {
        return potencia * horas;
    }

    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }

    @Override
    public String toString() {
        return "Electrodoméstico: " + tipo + ", Marca: " + marca + ", Potencia: " + potencia + " kW";
    }
}