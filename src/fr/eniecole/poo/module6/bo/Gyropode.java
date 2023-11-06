package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique{

    private int tailleMinCm;
    static final double PRIX_LOCATION = 29.9;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
        super(dateAchat, marque, modele, autonomieKm);
    }

    @Override
    public double getTarifLocationHeure() {
        return super.getTarifLocationHeure();
    }

    @Override
    public String toString() {
        return "Gyropode{" +
                "tailleMinCm=" + tailleMinCm +
                '}';
    }
}
