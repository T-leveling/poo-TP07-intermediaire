package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class CycleElectrique extends Cycle implements Rechargeable{

    private int autonomieKm;
    private int percentBatteryLevel;
    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele);
    }

    @Override
    public double getTarifLocationHeure() {
        return 0;
    }
}
