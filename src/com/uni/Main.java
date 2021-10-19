package com.uni;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Benutzer Schuller = new Benutzer();

        Mannschaft basket = new Basketball();
        Mannschaft fusbal = new Fussball();
        Leichtathletik hindernislauf = new Hindernislauf();
        Leichtathletik hochsprung = new Hochsprung();

        ArrayList<Sport> lieblingsport = new ArrayList<Sport>();
        lieblingsport.add(basket);
        lieblingsport.add(fusbal);

        Schuller.setSports(lieblingsport);
        Schuller.setNachName("Calin");
        Schuller.setVorName("Andi");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht " + Schuller.kalkuliereZeit() + " Zeit fur seine Lieblingsporten");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht durchschnittlich " + Schuller.kalkuliereDurchschnittszeit() + " Zeit fur seine Lieblingsporten");
        System.out.println(Schuller.nachName + " " + Schuller.vorName + " braucht " + Schuller.kalkuliereZeit(basket) + " Zeit fur Basketball");
    }

}

