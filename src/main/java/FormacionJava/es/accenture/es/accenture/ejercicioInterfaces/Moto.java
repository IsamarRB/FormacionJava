package FormacionJava.es.accenture.es.accenture.ejercicioInterfaces;

public class Moto extends Vehiculos {

        // Constructor vacío
        public Moto() {
            super();
        }

        // Constructor con velocidad
        public Moto(int velocidad) {
            super(velocidad);
        }

        // Constructor de copia
        public Moto(Moto otra) {
            super(otra);
        }

        // Implementación del método frenar
        @Override
        public String frenar(int cuanto) {
            int nuevaVelocidad = getVelocidad() - cuanto;
            if (nuevaVelocidad < 0) nuevaVelocidad = 0;
            setVelocidad(nuevaVelocidad);
            return "La moto ha frenado y va a " + nuevaVelocidad + " km/hora.";
        }

        // Implementación del método acelerar
        @Override
        public String acelerar(int cuanto) {
            int nuevaVelocidad = getVelocidad() + cuanto;
            setVelocidad(nuevaVelocidad);

            if (nuevaVelocidad > VELOCIDAD_MAX) {
                return "Exceso de velocidad. La moto ha acelerado y va a " + nuevaVelocidad + " km/hora.";
            } else {
                return "La moto ha acelerado y va a " + nuevaVelocidad + " km/hora.";
            }
        }
    }


