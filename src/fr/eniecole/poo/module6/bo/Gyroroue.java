package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique{

    static final double PRIX_LOCATION = 18.9;
    public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele, autonomieKm);
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + PRIX_LOCATION + "€/heure";
    }

    @Override
    public double getTarifLocationHeure() {
        return super.getTarifLocationHeure();
    }
}
