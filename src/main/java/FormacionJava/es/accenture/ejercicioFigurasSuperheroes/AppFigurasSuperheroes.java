package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

public class AppFigurasSuperheroes {
    public static void main(String[] args) {
        Superheroe s1 = new Superheroe("Spiderman", "Puede lanzar telarañas", false);
        Superheroe s2 = new Superheroe("Batman", "Héroe nocturno con gadgets", true);
        Superheroe s3 = new Superheroe("Ladybug", "La Diosa de la creación", false);
        Superheroe s4 = new Superheroe("Las chicas superpoderosas", "3 hermanas con poderes", false);
        Superheroe s5 = new Superheroe("Goku", "Un super muy humano", false);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        Dimension dimPeq = new Dimension(20, 5, 6);
        Dimension dimGra = new Dimension(70, 20, 20);

        Figura f1 = new Figura("fig-01", 30.0, dimPeq, s1);
        Figura f2 = new Figura("fig-02", 30.0, dimPeq, s2);
        Figura f3 = new Figura("fig-03", 50.0, dimGra, s3);
        Figura f4 = new Figura("fig-04", 50.0, dimGra, s4);
        Figura f5 = new Figura("fig-05", 50.0, dimGra, s5);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);

        f4.subirPrecio(10);
        System.out.println("Después de subir precio:");
        System.out.println(f4);
    }
}
