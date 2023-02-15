
package patron_adapter;


public class Lampara implements Conectable{
    private boolean encendida;
    
    @Override
    public boolean isEncendida(){
        return this.encendida;
    }
    @Override
    public void encender(){
        this.encendida = true;
    }
    @Override
    public void apagar(){
        this.encendida = false;
    }
}
