package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colección {
    private String nombreColeccion;
    private List<Figura> listaFiguras;

    public Colección (String nombreColeccion, Figura listFiguras){
    this.nombreColeccion = nombreColeccion;
    this.listaFiguras = new ArrayList<>();
    }

    //Getters y setters
    public String getNombreColeccion() { return nombreColeccion; }
    public void setNombreColeccion(String nombreColeccion) { this.nombreColeccion = nombreColeccion; }

    public List<Figura> getListaFiguras() { return listaFiguras; }
    public void setListaFiguras(List<Figura> listaFiguras) { this.listaFiguras = listaFiguras; }

    //Métodos propios
    public void incluirFigura(Figura fig) {
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura f : listaFiguras) {
            if (f.getId().equals(id)) {
                f.subirPrecio(cantidad);
                break;
            }
        }
    }

    public String conCapa() {
        StringBuilder sb = new StringBuilder("Figuras con capa:\n");
        for (Figura f : listaFiguras) {
            if (f.getSuperheroe().isCapa()) {
                sb.append(f).append("\n");
            }
        }
        return sb.toString();
    }

    public Figura masValioso() {
        return Collections.max(listaFiguras, Comparator.comparing(Figura::getPrecio));
    }

    public double getValorColeccion() {
        return listaFiguras.stream().mapToDouble(Figura::getPrecio).sum();
    }

    public double getVolumenColeccion() {
        return listaFiguras.stream().mapToDouble(Figura::getVolumen).sum() + 200;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Colección: " + nombreColeccion + "\n");
        for (Figura f : listaFiguras) {
            sb.append(f).append("\n");
        }
        return sb.toString();
    }
}