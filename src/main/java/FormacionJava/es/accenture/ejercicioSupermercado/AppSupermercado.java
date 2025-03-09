package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppSupermercado {
    public static void main(String[] args) {
        // Crear instancias de productos
        Detergente detergente = new Detergente("Limpiamas", 2.5, 33, "Botella de plástico", 2);
        Cereales cereales = new Cereales("Crunchy", "Espelta", 3.0, LocalDate.of(2022, 8, 2));
        Vino vino = new Vino("Plimplar", "Tinto", 12.0, 8.0, 330, "Botella de cristal",
                LocalDate.of(2023, 7, 12), 5);

        // Lista de productos para calcular el precio total
        List<Object> productos = new ArrayList<>();
        productos.add(detergente);
        productos.add(cereales);
        productos.add(vino);

        // Imprimir los productos
        for (Object producto : productos) {
            System.out.println(producto);
        }

        // Calcular el precio total
        double precioTotal = detergente.getPrecioDescuento() + cereales.precio + vino.getPrecioDescuento();
        System.out.printf("\nPrecio total de todos los productos: %.2f€\n", precioTotal);

        // Calcular las calorías totales de los productos alimenticios
        int totalCalorias = cereales.getCalorias() + vino.getCalorias();
        System.out.println("Total calorías: " + totalCalorias);
    }
}
