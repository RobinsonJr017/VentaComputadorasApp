package mundopc.modelo;

public class Computadora {
    private static int contadorComputadores;
    private int idComputador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    private Computadora(){
        idComputador = ++contadorComputadores;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{\n"+
                " idComputador=" + idComputador +
                ",  nombre='" + nombre + '\'' +
                ", \n   monitor=" + monitor +
                ", \n   teclado=" + teclado +
                ", \n   raton=" + raton +
                '}';
    }
}
