package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Velo extends Cycle{

    int nbVitesses;
    static final double PRIX_LOCATION = 4.90;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
        super(dateAchat, marque, modele);
        this.nbVitesses = nbVitesses;
    }

    @Override
    public int age() {
        return (int) ChronoUnit.YEARS.between(getDateAchat(), LocalDate.now());
    }

    @Override
    public double getTarifLocationHeure() {
        return PRIX_LOCATION;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + age() + "ans) " + this.nbVitesses + " vitesses" + "\t" + PRIX_LOCATION + "€/heure";
    }
}
