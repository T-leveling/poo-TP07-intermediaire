package fr.eniecole.poo.module6;

import fr.eniecole.poo.module6.bo.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

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

        Gyropode segway = new Gyropode(LocalDate.of(2018, 6, 5), "Segway", "Ninebot Elite", 40, 150);
        cycles.add(segway);
        Gyropode weebot = new Gyropode(LocalDate.of(2017, 5, 2), "Weebot", "Echo", 35, 160);
        cycles.add(weebot);
        Gyroroue immotion = new Gyroroue(LocalDate.of(2018, 3, 25), "Immotion", "v8", 40);
        cycles.add(immotion);
        Gyroroue segway2 = new Gyroroue(LocalDate.of(2018, 3, 25), "Segway", "Ninebot One E+", 30);
        cycles.add(segway2);

        for (Cycle cycle : cycles) {
            System.out.println(cycle);
        }

        System.out.println("------------------------------");
        System.out.println("Voici les cycles électriques que nous proposons à la location :");
        for (Cycle cycleElectrique: cycles){
           if (cycleElectrique instanceof CycleElectrique){
               System.out.println(cycleElectrique);
           }
        }

        System.out.println("------------------------------");
        System.out.println("Voici les cycles de type Velo que nous proposons à la location :");
        for(Cycle velos: cycles){
            if (velos instanceof Velo){
                System.out.println(velos);
            }
        }

    }
}