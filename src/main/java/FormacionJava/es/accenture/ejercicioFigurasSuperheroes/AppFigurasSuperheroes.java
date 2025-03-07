package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

public class AppFigurasSuperheroes {
    public static void main(String[] args) {
        // Creación de superhéroes
        System.out.println(" ____                        _                              \n" +
                "/ ___| _   _ _ __   ___ _ __| |__   ___ _ __ ___   ___  ___ \n" +
                "\\___ \\| | | | '_ \\ / _ \\ '__| '_ \\ / _ \\ '__/ _ \\ / _ \\/ __|\n" +
                " ___) | |_| | |_) |  __/ |  | | | |  __/ | | (_) |  __/\\__ \\\n" +
                "|____/ \\__,_| .__/ \\___|_|  |_| |_|\\___|_|  \\___/ \\___||___/\n" +
                "            |_|                                             ");

        Superheroe s1 = new Superheroe("Spiderman", "Lanza tela de araña y viste de rojo", false);
        Superheroe s2 = new Superheroe("Batman", "Tiene los poderes de un murciélago", true);
        Superheroe s3 = new Superheroe("Ironman", "Superhéroe con traje de metal capaz de volar", false);
        Superheroe s4 = new Superheroe("Thor", "Dios del trueno", true);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(); // Salto de línea

        // Creación de dimensiones
        Dimension dimPeq = new Dimension(20, 5, 6);
        Dimension dimGra = new Dimension(70, 20, 20);

        // Creación de figuras
        Figura f1 = new Figura("fig-01", 30.0, dimPeq, s1);
        Figura f2 = new Figura("fig-02", 30.0, dimPeq, s2);
        Figura f3 = new Figura("fig-03", 50.0, dimGra, s3);
        Figura f4 = new Figura("fig-04", 50.0, dimGra, s4);

        // Impresión de lista de figuras
        System.out.println("Listado de figuras");
        System.out.println("--------------------");

        System.out.println(s1.getNombre() + " con un precio de " + f1.getPrecio() + "€ y un volumen de " + f1.calcularVolumen());
        System.out.println(s2.getNombre() + " con un precio de " + f2.getPrecio() + "€ y un volumen de " + f2.calcularVolumen());
        System.out.println(s3.getNombre() + " con un precio de " + f3.getPrecio() + "€ y un volumen de " + f3.calcularVolumen());
        System.out.println(s4.getNombre() + " con un precio de " + f4.getPrecio() + "€ y un volumen de " + f4.calcularVolumen());
        System.out.println();

        // Subir precio de figuras
        f1.subirPrecio(10);
        f2.subirPrecio(10);
        f3.subirPrecio(10);
        f4.subirPrecio(10);

        System.out.println("Listado de figuras con el precio actualizado");
        System.out.println("----------------------------------------------");

        System.out.println(s1.getNombre() + " con un precio actual de " + f1.getPrecio() + "€");
        System.out.println(s2.getNombre() + " con un precio actual de " + f2.getPrecio() + "€");
        System.out.println(s3.getNombre() + " con un precio actual de " + f3.getPrecio() + "€");
        System.out.println(s4.getNombre() + " con un precio actual de " + f4.getPrecio() + "€");
    }
}
