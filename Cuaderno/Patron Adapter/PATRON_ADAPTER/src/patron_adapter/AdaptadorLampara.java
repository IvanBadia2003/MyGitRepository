package patron_adapter;


public class AdaptadorLampara implements Conectable{
    
    private LamparaInglesa lInglesa1 = new LamparaInglesa();
    
    public boolean isEncendida(){
        return this.lInglesa1.isOn();
    }
    
    public void encender(){
        this.lInglesa1.on();
    }

    @Override
    public void apagar() {
        this.lInglesa1.off();
    }
    
    
}
