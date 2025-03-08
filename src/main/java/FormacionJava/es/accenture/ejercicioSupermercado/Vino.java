package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

public class Vino implements ConDescuento, EsAlimento, EsLiquido{
    private String marca;
    private double precio;
    private String tipoVino;
    private double gradosAlcohol;
    private double volumen;
    private String tipoEnvase;
    private LocalDate caducidad;
    private double descuento;

    public Vino(String plimplar, String tinto, double v, double gradosAlcohol, int volumen, String botellaDeCristal, LocalDate caducidad, int descuento){}

    public Vino(String marca, double precio, String tipoVino, double gradosAlcohol, double volumen, String tipoEnvase, LocalDate caducidad, double descuento){
        this.marca = marca;
        this.precio = precio;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.caducidad = caducidad;
        this.descuento = descuento;
    }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getTipoVino() { return tipoVino; }
    public void setTipoVino(String tipoVino) { this.tipoVino = tipoVino; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setGradosAlcohol(double gradosAlcohol) { this.gradosAlcohol = gradosAlcohol; }
    public double getGradosAlcohol() { return gradosAlcohol; }
    public void setVolumen(double v) { this.volumen = v; }
    public double getVolumen() { return volumen; }
    public void setTipoEnvase(String env) { this.tipoEnvase = env; }
    public String getTipoEnvase() { return tipoEnvase; }
    public void setCaducidad(LocalDate fc) { this.caducidad = fc; }
    public LocalDate getCaducidad() { return caducidad; }
    public int getCalorias() { return (int) (gradosAlcohol * 10); }
    public void setDescuento(double des) { this.descuento = des; }
    public double getDescuento() { return descuento; }
    public double getPrecioDescuento() { return precio - (precio * descuento / 100); }

    @Override
    public String toString() {
        return "Vino [Marca=" + marca + ", TipoVino=" + tipoVino + ", Precio=" + precio + "€, GradosAlcohol=" + gradosAlcohol +
                "°, Volumen=" + volumen + "ml, TipoEnvase=" + tipoEnvase + ", Caducidad=" + caducidad + ", Calorías=" + getCalorias() +
                ", Descuento=" + descuento + "%, Precio Final=" + getPrecioDescuento() + "€]";
    }
}
