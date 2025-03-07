package FormacionJava.es.accenture.ejercicioElectrodomesticos;

public class AppElectrodomesticos {
    private static final int HORAS = 10;
    private static final double PRECIO_KWH = 0.5;

    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico();
        e.setTipo("Frigorifico");
        e.setMarca("Balay");
        e.setPotencia(0.67);

        Lavadora l1 = new Lavadora("Lavadora", "Zanussi", 0.5, 595.0, false);
        Lavadora l2 = new Lavadora("Lavadora", "Zanussi", 0.5, 490.0, true);

        System.out.println(e);
        System.out.println("Consumo: " + e.getConsumo(HORAS) + " kW");
        System.out.println("Coste de consumo: " + e.getCosteConsumo(HORAS, PRECIO_KWH) + "€\n");

        System.out.println(l1);
        System.out.println("Consumo: " + l1.getConsumo(HORAS) + " kW");
        System.out.println("Coste de consumo: " + l1.getCosteConsumo(HORAS, PRECIO_KWH) + "€\n");

        System.out.println(l2);
        System.out.println("Consumo: " + l2.getConsumo(HORAS) + " kW");
        System.out.println("Coste de consumo: " + l2.getCosteConsumo(HORAS, PRECIO_KWH) + "€");
    }
}
