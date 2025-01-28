package mundopc;

import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("blutooth", "lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoRedragon = new Teclado("tipo C", "redragon");
        System.out.println(tecladoRedragon);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);
    }
}
