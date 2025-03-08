package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;


import java.text.DecimalFormat;

public class RevisionAlarma extends Servicio {
    private int numeroAlarmas;

    public RevisionAlarma(String fechaInicio, String cliente, int numeroAlarmas) {
        super("Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numeroAlarmas = numeroAlarmas;
    }

    public int getNumeroAlarmas() {
        return numeroAlarmas;
    }

    public void setNumeroAlarmas(int numeroAlarmas) {
        this.numeroAlarmas = numeroAlarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numeroAlarmas / 3.0) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return "Revisión de alarmas realizada para " + getCliente() +
                " con un costo total de " + formato.format(costeTotal()) + "€";
    }
}

