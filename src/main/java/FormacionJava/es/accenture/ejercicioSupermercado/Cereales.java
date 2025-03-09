package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate caducidad;

    public Cereales() {
    }

    public Cereales(String marca, String tipoCereal, double precio, LocalDate caducidad) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
        this.caducidad = caducidad;
    }

    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public int getCalorias() {
        switch (tipoCereal.toLowerCase()) {
            case "espelta":
                return 5;
            case "maíz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales(marca=" + marca + ", tipoCereal=" + tipoCereal +
                ", precio=" + precio + ", caducidad=" + caducidad +
                ", calorías=" + getCalorias() + ")";
    }
}