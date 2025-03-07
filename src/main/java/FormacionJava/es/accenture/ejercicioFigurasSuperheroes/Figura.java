package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;

    //constructores
    public Figura(){} //constructor vacío

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) { //constructor de parámetros
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }
    public Figura(Figura e) { //constructor de copia
        this.codigo = e.codigo;
        this.precio = e.precio;
        this.dimension = e.dimension;
        this.superheroe = e.superheroe;
    }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public Dimension getDimension() { return dimension; }
    public void setDimension(Dimension dimension) { this.dimension = dimension; }

    public Superheroe getSuperheroe() { return superheroe; }
    public void setSuperheroe(Superheroe superheroe) { this.superheroe = superheroe; }

    public void subirPrecio(double cantidad){
        this.precio += cantidad;
    }

    @Override
    public String toString() {
        return "Figura{" + "codigo='" + codigo + '\'' + ", precio=" + precio + ", dimension=" + dimension + ", superheroe=" + superheroe + '}';
    }
}
