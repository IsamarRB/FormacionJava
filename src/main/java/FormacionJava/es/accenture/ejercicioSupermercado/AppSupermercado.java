package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppSupermercado {
    public static void main(String[] args) {
        // Creación de objetos
        Detergente detergente = new Detergente("Limpiamas", 2.5, 33, "Botella de plástico", 2);
        Cereales cereales = new Cereales("Crunchy", "Espelta", 3.0, LocalDate.of(2022, 8, 2));
        Vino vino = new Vino("Plimplar", "Tinto", 12.0, 8.0, 330, "Botella de cristal", LocalDate.of(2023, 7, 12), 5);

        // Mostrar productos
        System.out.println(detergente);
        System.out.println(cereales);
        System.out.println(vino);

        // Calcular suma total de precios
        double totalPrecio = detergente.getPrecioDescuento() + cereales.getPrecio() + vino.getPrecioDescuento();
        System.out.println("Precio total de todos los productos: " + totalPrecio + "€");

        // Polimorfismo con lista de alimentos
        List<EsAlimento> alimentos = new ArrayList<>();
        alimentos.add(cereales);
        alimentos.add(vino);

        int totalCalorias = alimentos.stream().mapToInt(EsAlimento::getCalorias).sum();
        System.out.println("Suma total de calorías de los alimentos: " + totalCalorias);
    }
}
