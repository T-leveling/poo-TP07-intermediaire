package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique{

    private int tailleMinCm;
    static final double PRIX_LOCATION = 29.9;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int tailleMinCm) {
        super(dateAchat, marque, modele, autonomieKm);
        this.tailleMinCm = tailleMinCm;
    }

    @Override
    public double getTarifLocationHeure() {
        return super.getTarifLocationHeure();
    }

    @Override
    public String toString() {
        return super.toString() + " [" + this.tailleMinCm + "cm min] " + PRIX_LOCATION +"€/heure";
    }
}
