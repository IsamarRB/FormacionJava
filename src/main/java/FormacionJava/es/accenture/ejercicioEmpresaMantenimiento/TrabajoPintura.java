package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;

import java.text.DecimalFormat;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String antonio, String date, String segurosMartínez, int i, int i1) {} //Constructor vacío

    public TrabajoPintura(double superficie, double precioPintura){  //Constructor de parámetros
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public TrabajoPintura(TrabajoPintura e){ //Constructor de copia
        this.superficie = e.superficie;
        this.precioPintura = e.precioPintura;
    }

    //Getter y Setters
    public double getSuperficie() { return superficie;}
    public void setSuperficie(double superficie) { this.superficie = superficie;}

    public double getPrecioPintura() { return precioPintura; }
    public void setPrecioPintura(double precioPintura) { this.precioPintura = precioPintura; }

    //Métodos sobreescritos heredados de la clase Servicio
    @Override
    public double costeMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie / 10) * 9.5;
    }

    @Override
    public double costeTotal() {
        double total = costeMaterial() + costeManoObra();
        if (superficie < 50) {
            total *= 1.15; // Aumento del 15%
        }
        return total;
    }

    @Override
    public String detalleServicio() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return "Trabajo de pintura realizado por " + getTrabajador() +
                " para el cliente " + getCliente() +
                " con un costo total de " + formato.format(costeTotal()) + "€";
    }
}
