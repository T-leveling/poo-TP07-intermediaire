package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public class Velo extends Cycle{

    int nbVitesses;
    static final double PRIX_LOCATION = 4.9;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
        super(dateAchat, marque, modele);
        this.nbVitesses = nbVitesses;
    }

    @Override
    public double getTarifLocationHeure() {
        return PRIX_LOCATION;
    }
}
