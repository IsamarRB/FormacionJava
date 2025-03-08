package FormacionJava.es.accenture.ejercicioInterfaces;

public abstract class Vehiculos implements IVehiculo {
    private int velocidad; // Atributo de velocidad

    // Constructor vacío
    public Vehiculos() {
        this.velocidad = 0;
    }

    // Constructor con parámetro
    public Vehiculos(int velocidad) {
        this.velocidad = velocidad;
    }

    // Constructor de copia
    public Vehiculos(Vehiculos otro) {
        this.velocidad = otro.velocidad;
    }

    // Getter y Setter
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Métodos abstractos a implementar en las clases hijas
    public abstract String frenar(int cuanto);
    public abstract String acelerar(int cuanto);
}
