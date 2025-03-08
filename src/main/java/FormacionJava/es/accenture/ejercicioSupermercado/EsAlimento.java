package FormacionJava.es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

public interface EsAlimento {
    void setCaducidad(LocalDate fc);
    LocalDate getCaducidad();
    int getCalorias();
}
