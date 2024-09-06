package nl.han.bewd.lambdas;
import nl.han.bewd.lambdas.reis.*;
import java.util.Random;

public class Main {
    /*
    Een Reis wordt gemaakt met een enkel vervoermiddel. De reistijd kan door middel van een simulatie van de
    reis worden berekend. Hierbij kan onderscheid gemaakt worden of de reis tijdens de spits of buiten de spits is.
     */
    public static void main(String[] args) {
        System.out.println("Buiten spits met fiets");
        //maakt nieuwe class Reis aan
        Reis mijnReis = new Reis(false);
        //maakt nieuwe class FietsVervoerStrategy aan
        VervoerStrategy vervoer = new FietsVervoerStrategy();
        //roept de methode simuleerReis aan met de parameter vervoer
        mijnReis.simuleerReis(vervoer);

        
        System.out.println("Tijdens de spits");
        // spits bestaan nu
        mijnReis.setSpits(true);
        mijnReis.simuleerReis(vervoer);                   // Met fiets
        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
        mijnReis.simuleerReis(new OVVervoerStrategy());   // Met OV

        System.out.println("Met <nieuw> vervoer (Stap 2)  ");
        System.out.println("TODO:");

        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");
        System.out.println("TODO:");
    }
}