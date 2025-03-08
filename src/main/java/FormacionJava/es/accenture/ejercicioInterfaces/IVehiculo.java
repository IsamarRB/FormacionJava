package FormacionJava.es.accenture.ejercicioInterfaces;

public interface IVehiculo {
    int VELOCIDAD_MAX = 120; // Constante de velocidad máxima

    String frenar(int cuanto);
    String acelerar(int cuanto);
}
