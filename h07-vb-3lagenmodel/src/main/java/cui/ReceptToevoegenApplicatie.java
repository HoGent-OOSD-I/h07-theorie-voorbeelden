package cui;

import domein.DomeinController;

public class ReceptToevoegenApplicatie {
    DomeinController dc;
    public ReceptToevoegenApplicatie(DomeinController dc) {
        this.dc = dc;
    }

    public void voegReceptToe()
    {
        IO.println(String.format("Het aantal recepten in de database is nu: %d%n", dc.geefAantalRecepten()));

        IO.println("We gaan nu een recept toevoegen");
        String naam = IO.readln("Naam recept: ");

        int tijd = Integer.parseInt(IO.readln("Bereidingstijd (min): "));

        int personen = Integer.parseInt(IO.readln("Aantal personen: "));

        dc.voegReceptToe(naam, tijd, personen);
        IO.println("Het recept werd toegevoegd!");
        IO.println(String.format("Het aantal recepten in de database is nu: %d%n", dc.geefAantalRecepten()));
    }
}
