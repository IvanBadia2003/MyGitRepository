package patron_adapter;


public class PATRON_ADAPTER {
    
    public static void main(String[] args) {
        
        Conectable lampara = new Lampara();
        Conectable ordenador = new Ordenador();
        Conectable l2 = new AdaptadorLampara();
        encenderAparato(lampara);
        encenderAparato(ordenador);
        encenderAparato(l2);
        /*lampara.encender();
        System.out.println("Está encendida: " + 
                        lampara.isEncendida());
        */
        /*ordenador.encender();
        System.out.println("Está encendida: " + 
                        ordenador.isEncendida());
        */
    }
    
    private static void encenderAparato(Conectable h){
        h.encender();
        System.out.println(h.isEncendida());
    }
}
