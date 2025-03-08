package FormacionJava.es.accenture.es.accenture.ejercicioInterfaces;

public class UsoVehiculo {
        public static void main(String[] args) {
            // Creación del coche con velocidad inicial de 100
            Coche miCoche = new Coche(100);
            System.out.println(miCoche.acelerar(30)); // Acelerar en 30
            System.out.println(miCoche.frenar(10)); // Frenar en 10

            // Creación de la moto con velocidad inicial de 80
            Moto miMoto = new Moto(80);
            System.out.println(miMoto.acelerar(30)); // Acelerar en 30
            System.out.println(miMoto.frenar(10)); // Frenar en 10
        }
    }