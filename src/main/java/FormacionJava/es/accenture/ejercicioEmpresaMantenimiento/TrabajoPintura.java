package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;


import java.text.DecimalFormat;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador, String fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

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
        double costeMaterial = costeMaterial();
        double costeManoObra = costeManoObra();
        double costeTotal = costeMaterial + costeManoObra;

        if (superficie < 50) {
            costeTotal *= 1.15; // Añadir 15% si la superficie es menor a 50m²
        }

        return costeTotal;
    }

    @Override
    public String detalleServicio() {
        DecimalFormat formato = new DecimalFormat("#.00");
        double costeMaterial = costeMaterial();
        double costeManoObra = costeManoObra();
        double costeTotal = costeTotal();
        double costeAdicional = (superficie < 50) ? (costeTotal - (costeMaterial + costeManoObra)) : 0;

        return "TRABAJO DE PINTURA\n" +
                "Cliente: " + getCliente() + "\n" +
                "Fecha de Inicio: " + getFechaInicio() + "\n" +
                "-----------------------------------------\n" +
                "Pintor: " + getTrabajador() + "\n" +
                "Coste Material: " + formato.format(costeMaterial) + "€\n" +
                "Coste Mano Obra: " + formato.format(costeManoObra) + "€\n" +
                "Coste Adicional: " + formato.format(costeAdicional) + "€\n" +
                "Total: " + formato.format(costeTotal) + "€\n" +
                "--------------------------------------\n";
    }
}
