package FormacionJava.es.accenture.ejercicioSupermercado;

class Detergente implements ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente() {}

    public Detergente(String marca, double precio, double volumen, String tipoEnvase, double descuento) {
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.descuento = descuento;
    }

    public void setDescuento(double des) { this.descuento = des; }
    public double getDescuento() { return descuento; }
    public double getPrecioDescuento() { return precio - (precio * descuento / 100); }

    @Override
    public String toString() {
        return "Detergente(marca=" + marca + ", precio=" + precio +
                ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase +
                ", descuento=" + descuento + ", precio con descuento=" + getPrecioDescuento() + ")";
    }
}