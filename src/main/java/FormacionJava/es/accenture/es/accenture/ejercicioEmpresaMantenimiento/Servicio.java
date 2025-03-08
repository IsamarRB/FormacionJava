package FormacionJava.es.accenture.es.accenture.ejercicioEmpresaMantenimiento;


public abstract class Servicio {
    private String trabajador;
    private String fechaInicio;
    private String cliente;

    // Constructor vacío
    public Servicio() {}

    // Constructor con parámetros
    public Servicio(String trabajador, String fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    // Getters y Setters
    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Métodos abstractos
    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
}
