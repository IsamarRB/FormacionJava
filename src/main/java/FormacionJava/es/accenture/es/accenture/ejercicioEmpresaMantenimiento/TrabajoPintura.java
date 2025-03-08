package FormacionJava.es.accenture.es.accenture.ejercicioEmpresaMantenimiento;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura() {} //Constructor vacío

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
        return 0;
    }

    @Override
    public double costeManoObra() {
        return 0;
    }

    @Override
    public double costeTotal() {
        return 0;
    }

    @Override
    public String detalleServicio() {
        return "";
    }
}
