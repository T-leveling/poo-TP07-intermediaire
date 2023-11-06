package fr.eniecole.poo.module6.bo;

import java.time.LocalDate;

public abstract class Cycle {

   private LocalDate dateAchat;
   String marque;
   String modele;

    public Cycle(LocalDate dateAchat, String marque, String modele) {
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }

    public void age(){

    }

    public abstract double getTarifLocationHeure();

    @Override
    public String toString() {
        return "Cycle{" +
                "dateAchat=" + dateAchat +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                '}';
    }
}
