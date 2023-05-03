package classs;

public class Impresora extends ProdInformatico{
    Integer impPorMin;

    public Impresora(Integer stock, String nombre, Double precio, Boolean oferta, String fabricante, Integer impPorMin) {
        super(stock, nombre, precio, oferta, fabricante);
        this.impPorMin = impPorMin;
    }

    public Integer getImpPorMin() {
        return impPorMin;
    }

    public void setImpPorMin(Integer impPorMin) {
        this.impPorMin = impPorMin;
    }
    @Override
    public String toString() {
        return "Impresora{" +
                "impPorMin=" + impPorMin +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
