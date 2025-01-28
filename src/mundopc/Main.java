package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("blutooth", "lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("tipo C", "redragon");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);

        //Crear objeto de tipo computadora
        Computadora compuatdorlenovo = new Computadora("Computadora Lenovo",
                monitorLenovo, tecladoLenovo, ratonLenovo );

        System.out.println(compuatdorlenovo);

    }
}
