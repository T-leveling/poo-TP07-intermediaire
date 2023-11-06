package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class CycleElectrique extends Cycle implements Rechargeable{

    private int autonomieKm;
    private int percentBatteryLevel;
    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele);
        this.autonomieKm = autonomieKm;
    }

    @Override
    public double getTarifLocationHeure() {
        return 0;
    }


    @Override
    public String toString() {
        return "CycleElectrique{" +
                "autonomieKm=" + autonomieKm +
                ", percentBatteryLevel=" + percentBatteryLevel +
                '}';
    }

    @Override
    public void setBatteryLevel(int batteryLevel) {

    }

    @Override
    public int getBatteryLevel() {
        return 0;
    }

    public void charger(){

    }
}
