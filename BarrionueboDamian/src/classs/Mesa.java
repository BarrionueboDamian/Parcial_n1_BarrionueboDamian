package classs;

public class Mesa extends Producto{
    Integer ancho;
    Integer alto;

    public Mesa(Integer ancho, Integer alto, Integer stock, String nombre, Double precio, Boolean oferta) {
        super(stock, nombre, precio, oferta);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
