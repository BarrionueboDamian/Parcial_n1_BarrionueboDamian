package classs;

public class Silla extends Producto{
    Boolean ruedas;

    public Silla(Boolean ruedas, Integer stock, String nombre, Double precio, Boolean oferta) {
        super(stock, nombre, precio, oferta);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
