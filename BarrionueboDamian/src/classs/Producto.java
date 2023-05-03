package classs;

abstract public class Producto {
    Integer stock;
    String nombre;
    Double precio;

    Boolean oferta;

    public Producto(Integer stock, String nombre, Double precio, Boolean oferta) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
        this.oferta = oferta;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Boolean getOferta() {
        return oferta;
    }

    public void setOferta(Boolean oferta) {
        this.oferta = oferta;
    }
    public void actualizarPrecio(){
        System.out.println(this.nombre);
        if(this instanceof Silla){
            System.out.println("El precio de lista es $"+ this.precio);
            this.precio = precio + (precio * 5) / 100;
            System.out.println("El precio actualizado es $"+ this.precio);
        }else if(this instanceof Mesa){
            System.out.println("El precio de lista es $"+ this.precio);
            this.precio = precio + + (precio * 10) / 100;
            System.out.println("El precio actualizado es $"+ this.precio);
        }else if(this instanceof Noteboook){
            System.out.println("El precio de lista es $"+ this.precio);
            this.precio = precio + + (precio * 15) / 100;
            System.out.println("El precio actualizado es $"+ this.precio);
        }else if(this instanceof Impresora){
            System.out.println("El precio de lista es $"+ this.precio);
            this.precio = precio + + (precio * 20) / 100;
            System.out.println("El precio actualizado es $"+ this.precio);
        }

    };
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
