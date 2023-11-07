package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class GyroRoue extends CycleElectrique{

    static final double PRIX_LOCATION = 18.9;
    public GyroRoue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele, autonomieKm);
    }

    @Override
    public String toString() {
        return  formatInfo(super.toString());
    }

    @Override
    public double getTarifLocationHeure() {
        return PRIX_LOCATION;
    }
}
