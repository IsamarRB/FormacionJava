package FormacionJava.es.accenture.ejercicioElectrodomesticos;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    // Constructores
    public Lavadora() {}

    public Lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public Lavadora(Lavadora l) {
        super(l);
        this.precio = l.precio;
        this.aguaCaliente = l.aguaCaliente;
    }

    // Getters y Setters
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public boolean isAguaCaliente() { return aguaCaliente; }
    public void setAguaCaliente(boolean aguaCaliente) { this.aguaCaliente = aguaCaliente; }

    // Sobrescribir método getConsumo
    @Override
    public double getConsumo(int horas) {
        if (aguaCaliente) {
            return horas * (getPotencia() + getPotencia() * 0.20);
        }
        return super.getConsumo(horas);
    }

    @Override
    public String toString() {
        return super.toString() + ", Precio: " + precio + "€, Agua Caliente: " + (aguaCaliente ? "Sí" : "No");
    }
}
