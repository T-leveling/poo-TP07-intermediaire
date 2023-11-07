package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cycle {

    private LocalDate dateAchat;
    String marque;
    String modele;

    public Cycle(LocalDate dateAchat, String marque, String modele) {
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }

    public abstract int age() ;

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public abstract double getTarifLocationHeure();

    @Override
    public String toString() {
        return " - " +getClass().getSimpleName() + " " + this.marque + " " + this.modele +
                " " + dateAchat;
    }
}
