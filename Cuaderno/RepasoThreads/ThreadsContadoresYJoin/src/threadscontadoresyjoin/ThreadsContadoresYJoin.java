package threadscontadoresyjoin;

import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 *
 * @author IVÁN
 */
public class ThreadsContadoresYJoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador c1 = new Contador(40, "Contador 1");
        Contador c2 = new Contador(50, "Contador 2");
        Contador c3 = new Contador(20, "Contador 3");
        Contador c4 = new Contador(70, "Contador 4");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadsContadoresYJoin.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Fin del programa");
    }

}
