package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {
    private String marca;
    private String tipoVino;
    private double gradosAlcohol;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private LocalDate caducidad;
    private double descuento;

    public Vino() {}

    public Vino(String marca, String tipoVino, double gradosAlcohol, double precio,
                double volumen, String tipoEnvase, LocalDate caducidad, double descuento) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.caducidad = caducidad;
        this.descuento = descuento;
    }

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
        return "Vino(marca=" + marca + ", tipoVino=" + tipoVino +
                ", grados=" + gradosAlcohol + ", precio=" + precio +
                ", volumen=" + volumen + ", tipoEnvase=" + tipoEnvase +
                ", caducidad=" + caducidad + ", descuento=" + descuento +
                ", precio con descuento=" + getPrecioDescuento() +
                ", calorías=" + getCalorias() + ")";
    }
}
