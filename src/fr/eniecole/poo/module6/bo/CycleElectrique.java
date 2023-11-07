package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CycleElectrique extends Cycle implements Rechargeable{

    private int autonomieKm;
    private int percentBatteryLevel;
    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele);
        this.autonomieKm = autonomieKm;
    }

    @Override
    public int age() {
        return (int) ChronoUnit.YEARS.between(getDateAchat(), LocalDate.now());
    }

    @Override
    public double getTarifLocationHeure() {
        return 0;
    }


    @Override
    public String toString() {
        return super.toString() + " (" + age() + "ans) " + this.autonomieKm + " km d'autonomie ";
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
