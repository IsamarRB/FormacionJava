package FormacionJava.es.accenture.ejercicioFigurasSuperheroes;

public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;

    // Constructores
    public Figura() {} // Constructor vacío

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) { // Constructor con parámetros
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = new Dimension(dimension); // Copia profunda
        this.superheroe = new Superheroe(superheroe); // Copia profunda
    }

    public Figura(Figura e) { // Constructor de copia
        this.codigo = e.codigo;
        this.precio = e.precio;
        this.dimension = new Dimension(e.dimension); // Copia profunda
        this.superheroe = new Superheroe(e.superheroe); // Copia profunda
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public Dimension getDimension() { return dimension; }
    public void setDimension(Dimension dimension) { this.dimension = new Dimension(dimension); } // Copia profunda

    public Superheroe getSuperheroe() { return superheroe; }
    public void setSuperheroe(Superheroe superheroe) { this.superheroe = new Superheroe(superheroe); } // Copia profunda

    // Método para aumentar el precio
    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }

    // Método para calcular volumen
    public double calcularVolumen() {
        return this.dimension.getAncho() * this.dimension.getAlto() * this.dimension.getProfundidad();
    }

    // Métodos corregidos
    public String getId() {
        return this.codigo;
    }

    public double getVolumen() {
        return calcularVolumen();
    }

    @Override
    public String toString() {
        return String.format(
                "Figura [Código: %s | Precio: %.2f€ | Volumen: %.2f | Superhéroe: %s]",
                codigo, precio, calcularVolumen(), superheroe
        );
    }
}

