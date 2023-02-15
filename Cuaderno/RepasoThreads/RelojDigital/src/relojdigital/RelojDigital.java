/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

import java.util.Observable;

/**
 *
 * @author IVÁN
 */
public class RelojDigital extends Observable implements Runnable{

    private int horas, minutos, segundos;

    public RelojDigital(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    

    
    @Override
    public void run() {
        
        String tiempo;
        while(true){
            tiempo="";
            
            if (horas<10) {
                tiempo+= "0" + horas;
            } else {
                tiempo += horas;
            }
            
            if (minutos<10) {
                tiempo+= "0" + minutos;
            } else {
                tiempo += minutos;
            }
            
            if (segundos<10) {
                tiempo+= "0" + segundos;
            } else {
                tiempo += segundos;
            }
            
            this.setChanged();
            this.notifyObservers(tiempo);
            this.clearChanged();
            
            segundos++;
            
            if (segundos==60) {
                minutos++;
                segundos=0;
                if (minutos==60) {
                    minutos=0;
                    horas++;
                    if (horas==24) {
                        horas=0;
                        
                    }
                }
            }
        }




    }
    
}