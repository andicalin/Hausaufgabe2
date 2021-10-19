//der Benutzer mit alle Lieblingsporte

package com.uni;

import java.util.ArrayList;

class Benutzer
{
    public String vorName;
    public String nachName;
    public ArrayList<Sport> sports;

    public ArrayList<Sport> getSports()
    {
        return sports;
    }

    public void setSports(ArrayList<Sport> sports)
    {
        this.sports = sports;
    }

    public void setNachName(String nachName)
    {
        this.nachName = nachName;
    }

    public void setVorName(String vorName)
    {
        this.vorName = vorName;
    }

    public String getVorName()
    {
        return this.vorName;
    }

    public String getNachName()
    {
        return this.nachName;
    }
    //eine Funktion fur die kalkulierte Zeit
    public double kalkuliereZeit()
    {
        double a = 0;
        for (Sport i : this.sports)
        {
            a = a + i.kalkuliereZeit();
        }
        return a;
    }

    public double kalkuliereDurchschnittszeit()
    {
        return kalkuliereZeit() / this.sports.size();
    }

    //eine Funktion fur die kalkulierte Zeit fur ein bezugliches Sport
    public double kalkuliereZeit(Sport sport)
    {
        double az = 0;
        for (Sport i : this.sports)
        {
            if (sport.kalkuliereZeit() == i.kalkuliereZeit())
                az += i.kalkuliereZeit();
        }
        return az;
    }
}

