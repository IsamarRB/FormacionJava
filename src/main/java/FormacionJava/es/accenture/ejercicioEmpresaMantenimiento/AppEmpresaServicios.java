package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AppEmpresaServicios {
    public static void main(String[] args) {
        List<Servicio> servicios = new ArrayList<>();

        servicios.add(new TrabajoPintura("Antonio", "2022-9-10", "Seguros Martínez", 20, 4));
        servicios.add(new TrabajoPintura("Ana", "2022-8-8", "Fruteria La Pera", 10, 3));
        servicios.add(new TrabajoPintura("Juan", "2022-9-30", "Restaurante El Boqueron", 200, (int) 2.5));
        servicios.add(new RevisionAlarma("2022-8-6", "Colegio Santa Maria", 34));
        servicios.add(new RevisionAlarma("2022-10-1", "Hotel Las Palmeras", 70));

        DecimalFormat formato = new DecimalFormat("#.00");

        double costoTotalServicios = 0;
        double costoTotalSueldos = 0;

        for (Servicio servicio : servicios) {
            if (servicio instanceof TrabajoPintura) {
                TrabajoPintura tp = (TrabajoPintura) servicio;
                System.out.println("TRABAJO DE PINTURA");
                System.out.println("Cliente: " + tp.getCliente());
                System.out.println("Fecha de Inicio: " + tp.getFechaInicio());
                System.out.println("------------------------------");
                System.out.println("Pintor: " + tp.getTrabajador());
                System.out.println("Coste Material: " + formato.format(tp.costeMaterial()) + "€");
                System.out.println("Coste Mano Obra: " + formato.format(tp.costeManoObra()) + "€");

                double costeAdicional = (tp.getSuperficie() < 50) ? tp.costeTotal() - (tp.costeMaterial() + tp.costeManoObra()) : 0;
                System.out.println("Coste Adicional: " + formato.format(costeAdicional) + "€");
                System.out.println("TOTAL: " + formato.format(tp.costeTotal()) + "€\n");

            } else if (servicio instanceof RevisionAlarma) {
                RevisionAlarma ra = (RevisionAlarma) servicio;
                System.out.println("REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS");
                System.out.println("Cliente: " + ra.getCliente());
                System.out.println("Fecha: " + ra.getFechaInicio());
                System.out.println("------------------------------");
                System.out.println("TOTAL: " + formato.format(ra.costeTotal()) + "€\n");
            }

            costoTotalServicios += servicio.costeTotal();
            costoTotalSueldos += servicio.costeManoObra();
        }

        System.out.println("Coste total de todos los trabajos: " + formato.format(costoTotalServicios) + "€");
        System.out.println("Coste total de mano de obra: " + formato.format(costoTotalSueldos) + "€");
    }
}