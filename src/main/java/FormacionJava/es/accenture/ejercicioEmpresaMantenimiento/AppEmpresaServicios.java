package FormacionJava.es.accenture.ejercicioEmpresaMantenimiento;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class AppEmpresaServicios {
    public static void main(String[] args) {
        List<Servicio> servicios = new ArrayList<>();

        // Creación de instancias
        servicios.add(new TrabajoPintura("Antonio", "2022-9-10", "Seguros Martínez", 20, 4));
        servicios.add(new TrabajoPintura("Ana", "2022-8-8", "Fruteria La Pera", 10, 3));
        servicios.add(new TrabajoPintura("Juan", "2022-9-30", "Restaurante El Boqueron", 200, 2.5));
        servicios.add(new RevisionAlarma("2022-8-6", "Colegio Santa Maria", 34));
        servicios.add(new RevisionAlarma("2022-10-1", "Hotel Las Palmeras", 70));

        double costeTotalServicios = 0;
        double costeTotalManoObra = 0;

        // Mostrar detalles de cada servicio
        for (Servicio servicio : servicios) {
            System.out.println(servicio.detalleServicio());
            costeTotalServicios += servicio.costeTotal();
            costeTotalManoObra += servicio.costeManoObra();
        }

        // Mostrar totales
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("Coste total de todos los trabajos: " + formato.format(costeTotalServicios) + "€");
        System.out.println("Coste total de mano de obra: " + formato.format(costeTotalManoObra) + "€");
    }
}