import classs.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Hello CUSTOMER!");
        List<Producto> listaDeProductos = new ArrayList<>();

        ///Productos
        Producto sillaComun = new Silla(Boolean.FALSE, 210, "Silla comun", 1550.0, Boolean.TRUE);
        Producto sillaEscritorio = new Silla(Boolean.TRUE, 110, "Silla de escritorio", 5550.0, Boolean.TRUE);

        Producto mesaComun = new Mesa(1, 2, 50, "Mesa comun", 9550.0, Boolean.FALSE);
        Producto mesaDeLujo = new Mesa(1, 4, 50, "Mesa de lujo", 19550.0, Boolean.FALSE);

        Producto notebookSilco = new Noteboook(1, 26, "Notebook Silco - 8gb", 49550.0, Boolean.FALSE, "Silco");
        Producto notebookDelta = new Noteboook(1, 26, "Notebook Delta - 16gb", 99550.0, Boolean.FALSE, "Delta");

        Producto impresoraColor = new Impresora(100, "Impresora color", 49550.0, Boolean.TRUE,"Silco", 200);
        Producto impresoraTonner = new Impresora(200, "Impresora tonner", 59550.0, Boolean.TRUE,"Delta", 200);

        listaDeProductos.add(sillaComun);
        listaDeProductos.add(sillaEscritorio);
        listaDeProductos.add(mesaComun);
        listaDeProductos.add(mesaDeLujo);
        listaDeProductos.add(notebookSilco);
        listaDeProductos.add(notebookDelta);
        listaDeProductos.add(impresoraColor);
        listaDeProductos.add(impresoraTonner);

        for (Producto item : listaDeProductos) {
            item.toString();
        }


        ///DESCUENTOS
        for (Producto item : listaDeProductos) {
            if(item.getOferta() == Boolean.TRUE){
                int descuento = (int)Math.floor(Math.random()*20+1);
                System.out.println("El item" + item.getNombre() + "se le puede ofrecer con un " + descuento + "de descuento. Quedando a $" + ((item.getPrecio() * descuento) / 100));

            }
        }
        for (Producto item : listaDeProductos) {
            item.actualizarPrecio();
        }
    }

}