package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("blutooth", "lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("tipo C", "redragon");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        //Crear objeto de tipo computadora
        Computadora compuatdorlenovo = new Computadora("Computadora Lenovo",
                monitorLenovo, tecladoLenovo, ratonLenovo );

        //(System.out.println(compuatdorlenovo);

        //Creamos otro objeto computadora
        Monitor monitorAcer = new Monitor("Acer", 15);
        Teclado tecladoAcer = new Teclado("usb", "Acer");
        Raton ratonAcer = new Raton("c", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);


        //Creamos una Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuatdorlenovo);
        orden1.agregarComputadora(computadoraAcer);
        orden1.mostrarOrden();

        //Creamo Mac
        Monitor monitorMac = new Monitor("Mac", 15);
        Teclado tecladoMac = new Teclado("c", "Mac");
        Raton ratonMac = new Raton("blutooth", "Mac");
        Computadora computadoraMac = new Computadora("Computadora Mac", monitorMac, tecladoMac, ratonMac);

        //Creamos una Orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMac);
        orden2.agregarComputadora(computadoraAcer);
        orden2.agregarComputadora(compuatdorlenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}
