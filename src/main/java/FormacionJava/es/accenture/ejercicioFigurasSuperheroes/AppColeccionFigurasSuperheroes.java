/*package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

import java.util.Collections;
import java.util.List;

public class AppColeccionFigurasSuperheroes {
    public static void main(String[] args) {
        // 1. Crear Superhéroes
        Superheroe spiderman = new Superheroe("Spiderman", "Puede volar y lanza rayos por los ojos", false);
        Superheroe batman = new Superheroe("Batman", "Tiene los poderes de un murciélago", true);
        Superheroe ironman = new Superheroe("Ironman", "Superhéroe con traje de metal capaz de volar", false);
        Superheroe thor = new Superheroe("Thor", "Dios del trueno", true);
        Superheroe hulk = new Superheroe("Hulk", "Una bestia verde con superfuerza", false);

        // 2. Crear Dimensiones
        Dimension dimPeq = new Dimension(20, 5, 6);
        Dimension dimGra = new Dimension(70, 20, 20);

        // 3. Crear Figuras (corregido el orden de parámetros)
        Figura figSpiderman = new Figura("super-01", 30.0, dimPeq, spiderman);
        Figura figBatman = new Figura("bat-02", 30.0, dimPeq, batman);
        Figura figIronman = new Figura("iron-03", 50.0, dimGra, ironman);
        Figura figThor = new Figura("thor-01", 50.0, dimGra, thor);
        Figura figHulk = new Figura("hulk-01", 50.0, dimGra, hulk);

        // 4. Crear Colección Marvel
        Coleccion marvel = new Coleccion("Marvel");

        // 5. Añadir figuras de Marvel a la colección
        marvel.incluirFigura(figSpiderman);
        marvel.incluirFigura(figIronman);
        marvel.incluirFigura(figThor);
        marvel.incluirFigura(figHulk);

        // 6. Subir precio de Thor en 20€
        marvel.subirPrecio(20, "thor-01");

        // 7. Mostrar la colección
        System.out.println("Contenido de la colección:");
        System.out.println(marvel);

        // 8. Mostrar valor y volumen total de la colección
        System.out.printf("Valor total de la colección: %.2f€%n", marvel.getValorColeccion());
        System.out.printf("Volumen total de la colección: %.2f%n", marvel.getVolumenColeccion());

        // 9. Figura más valiosa
        System.out.println("Figura más valiosa: " + marvel.masValioso());

        // 10. Figuras con capa
        System.out.println("Figuras con capa: " + marvel.conCapa());

        // 11. Figuras ordenadas por nombre y precio (usando getter para obtener la lista)
        List<Figura> figurasOrdenadas = marvel.getListaFiguras();
        Collections.sort(figurasOrdenadas);
        System.out.println("Figuras ordenadas por nombre y precio:");
        for (Figura figura : figurasOrdenadas) {
            System.out.println(figura);
        }
    }
}*/
