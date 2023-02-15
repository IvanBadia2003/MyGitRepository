package threadscontadoresyjoin;

/**
 *
 * @author IVÁN
 */
public class Contador implements Runnable {

    private int contador;
    private int limite;
    private String nombre;

    public Contador(int limite, String nombre) {
        this.contador = 0;
        this.limite = limite;
        this.nombre = nombre;
    }

    @Override
    public void run() {

        while (contador <= limite) {
            System.out.println("Hilo " + nombre + ": " + contador);
            contador++;
        }

        System.out.println("Hilo " + nombre + " ya ha acabado");

    }
}
