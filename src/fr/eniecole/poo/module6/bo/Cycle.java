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

    protected String formatInfo(String info){
        var right = String.format("%.2f€/heure", getTarifLocationHeure());
        var buffer = 100 - (info.length() + right.length());
        return info + " ".repeat(buffer) + right;
    }

    public abstract int age() ;

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public abstract double getTarifLocationHeure();

    @Override
    public String toString() {
            return "- " + getClass().getSimpleName() + " " + marque + " " + modele + " (" + age() + "an)";
    }
}
