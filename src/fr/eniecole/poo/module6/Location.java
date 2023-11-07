package fr.eniecole.poo.module6;

import fr.eniecole.poo.module6.bo.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Location {
    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<Cycle>();
        System.out.println("Voici les cycles que nous proposons à la location");
        Velo lapierre = new Velo(LocalDate.of(2017, 6, 2), "Lapierre", "speed 400", 27);
        cycles.add(lapierre);
        Velo btwin = new Velo(LocalDate.of(2018, 4, 9), "Btwin", "riverside", 10);
        cycles.add(btwin);

        GyroPode segway = new GyroPode(LocalDate.of(2018, 6, 5), "Segway", "Ninebot Elite", 40, 150);
        cycles.add(segway);
        GyroPode weebot = new GyroPode(LocalDate.of(2017, 5, 2), "Weebot", "Echo", 35, 160);
        cycles.add(weebot);
        GyroRoue immotion = new GyroRoue(LocalDate.of(2018, 3, 25), "Immotion", "v8", 40);
        cycles.add(immotion);
        GyroRoue segway2 = new GyroRoue(LocalDate.of(2018, 3, 25), "Segway", "Ninebot One E+", 30);
        cycles.add(segway2);

        for (Cycle cycle : cycles) {
            System.out.println(cycle);
        }

        System.out.println("------------------------------");
        System.out.println("Voici les cycles électriques que nous proposons à la location :");
        for (Cycle cycleElectrique : cycles) {
            if (cycleElectrique instanceof CycleElectrique) {
                System.out.println(cycleElectrique);
            }
        }

        System.out.println("------------------------------");
        System.out.println("Voici les cycles de type Velo que nous proposons à la location :");
        for (Cycle velos : cycles) {
            if (velos instanceof Velo) {
                System.out.println(velos);
            }
        }

        System.out.println();
        System.out.println("*********PARTIE BONUS*********");
        System.out.println("------------------------------");
        System.out.println("Voici les cycles que nous proposons à la location triés par date d'achat :");

        sortByDateAchat(cycles);

        System.out.println("------------------------------");
        System.out.println("Voici les cycles que nous proposons à la location triés par prix de location :");

        sortByPrice(cycles);
    }

    private static void sortByPrice(ArrayList<Cycle> cycles) {
        Comparator<Cycle> comparator = Comparator.comparing(Cycle::getTarifLocationHeure);
        Collections.sort(cycles, comparator.reversed());
        for(Cycle cycle: cycles){
            System.out.println(cycle);
        }
    }

    private static void sortByDateAchat(ArrayList<Cycle> cycles) {
        Comparator<Cycle> comparator = Comparator.comparing(Cycle::getDateAchat);
        Collections.sort(cycles, comparator.reversed());
        for(Cycle cycle: cycles){
            System.out.println(cycle);
        }
    }

}
