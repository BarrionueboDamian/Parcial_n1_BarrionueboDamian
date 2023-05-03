package classs;

abstract public class ProdInformatico extends Producto{
    String fabricante;

    public ProdInformatico(Integer stock, String nombre, Double precio, Boolean oferta, String fabricante) {
        super(stock, nombre, precio, oferta);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProdInformatico{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }
}
