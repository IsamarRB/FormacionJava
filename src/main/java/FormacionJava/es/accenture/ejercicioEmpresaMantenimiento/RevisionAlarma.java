package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;


public class RevisionAlarma extends Servicio {
    private int numeroAlarmas;

    // Constructores
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
        return (numeroAlarmas / 3) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIO\n" +
                "Cliente: " + getCliente() + "\n" +
                "Fecha: " + getFechaInicio() + "\n" +
                "--------------------------------------\n" +
                "Total: " + String.format("%.2f", costeTotal()) + "\n" +
                "--------------------------------------";
    }
}