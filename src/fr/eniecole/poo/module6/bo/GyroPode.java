package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class GyroPode extends CycleElectrique{

    private int tailleMinCm;
    static final double PRIX_LOCATION = 29.9;

    public GyroPode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int tailleMinCm) {
        super(dateAchat, marque, modele, autonomieKm);
        this.tailleMinCm = tailleMinCm;
    }

    @Override
    public double getTarifLocationHeure() {
        return PRIX_LOCATION;
    }

    @Override
    public String toString() {
        return formatInfo( super.toString() + " [" + tailleMinCm / 100 + "m" + String.format("%02d",tailleMinCm % 100) + " min]");    }
}
