package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;

    public Cereales(String crunchy, String espelta, double v, LocalDate caducidad){}

    public Cereales(String marca, double precio, String tipoCereal, LocalDate caducidad){
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.caducidad = caducidad;
    }

    //Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca;}

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getTipoCereal() { return tipoCereal; }
    public void setTipoCereal(String tipoCereal) { this.tipoCereal = tipoCereal; }

    //Métodos sobreescritos de EsAlimento
    @Override
    public void setCaducidad(LocalDate fc) {}
    @Override
    public LocalDate getCaducidad() { return caducidad;}

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", caducidad=" + caducidad +
                '}';
    }

    @Override
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
}
