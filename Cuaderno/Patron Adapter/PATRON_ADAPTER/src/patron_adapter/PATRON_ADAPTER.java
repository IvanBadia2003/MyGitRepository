package patron_adapter;


public class PATRON_ADAPTER {
    
    public static void main(String[] args) {

        Conectable lampara = new Lampara();
        Conectable l2 = new AdaptadorLampara();
        
        encenderAparato(l2);
        encenderAparato(lampara);
        
        
    }
    
    public static void encenderAparato(Conectable h){
        h.encender();
        System.out.println(h.isEncendida());
    }
}
