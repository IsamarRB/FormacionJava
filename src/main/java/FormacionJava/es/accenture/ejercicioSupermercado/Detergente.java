package FormacionJava.es.accenture.ejercicioSupermercado;

public abstract class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    //Constructor vacío
    public Detergente(){}

    //Constructor con parámetros
    public Detergente(String marca, double precio, double volumen, String tipoEnvase, double descuento){
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.descuento = descuento;
    }

    //getter y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setVolumen(double v) { this.volumen = v; }
    public double getVolumen() { return volumen; }
    public void setTipoEnvase(String env) { this.tipoEnvase = env; }
    public String getTipoEnvase() { return tipoEnvase; }
    public void setDescuento(double des) { this.descuento = des; }
    public double getDescuento() { return descuento; }
    public double getPrecioDescuento() { return precio - (precio * descuento / 100);
    }

    //Método sobreescrito STRING
    @Override
    public String toString() {
        return "Detergente [Marca=" + marca + ", Precio=" + precio + "€, Volumen=" + volumen + "ml, TipoEnvase=" + tipoEnvase +
                ", Descuento=" + descuento + "%, Precio Final=" + getPrecioDescuento() + "€]";
    }
}
