package classs;

public class Noteboook extends ProdInformatico{
    Integer memoria;

    public Noteboook(Integer memoria,Integer stock, String nombre, Double precio, Boolean oferta, String fabricante) {
        super(stock, nombre, precio, oferta, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Noteboook{" +
                "memoria=" + memoria +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
