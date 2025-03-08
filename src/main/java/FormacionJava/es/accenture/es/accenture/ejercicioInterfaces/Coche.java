package FormacionJava.es.accenture.es.accenture.ejercicioInterfaces;

public class Coche extends Vehiculos {

    public Coche() { super(); }

        // Constructor con velocidad
        public Coche(int velocidad) {
            super(velocidad);
        }

        // Constructor de copia
        public Coche(Coche otro) {
            super(otro);
        }

        // Implementación del método frenar
        @Override
        public String frenar(int cuanto) {
            int nuevaVelocidad = getVelocidad() - cuanto;
            if (nuevaVelocidad < 0) nuevaVelocidad = 0;
            setVelocidad(nuevaVelocidad);
            return "El coche ha frenado y va a " + nuevaVelocidad + " km/hora.";
        }

        // Implementación del método acelerar
        @Override
        public String acelerar(int cuanto) {
            int nuevaVelocidad = getVelocidad() + cuanto;
            setVelocidad(nuevaVelocidad);

            if (nuevaVelocidad > VELOCIDAD_MAX) {
                return "Exceso de velocidad. El coche ha acelerado y va a " + nuevaVelocidad + " km/hora.";
            } else {
                return "El coche ha acelerado y va a " + nuevaVelocidad + " km/hora.";
            }
        }
    }