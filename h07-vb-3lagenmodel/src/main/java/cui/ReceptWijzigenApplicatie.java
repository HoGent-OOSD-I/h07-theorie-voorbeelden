package cui;

import domein.DomeinController;

public class ReceptWijzigenApplicatie {
    DomeinController dc;
    public ReceptWijzigenApplicatie(DomeinController dc) {
        this.dc = dc;
    }

    public void wijzigRecept() {
        String[] recepten = dc.geefAlleRecepten();
        for (int i = 0; i < recepten.length; i++) {
            IO.println((i + 1) + ". " + recepten[i]);
        }

        int gekozenNummer = Integer.parseInt(IO.readln("Welk recept wil je wijzigen? Geef het nummer uit de lijst: "));
        int index = gekozenNummer - 1;

        IO.println("Wat wil je wijzigen? Kies 1 voor aantal personen of 2 voor bereidingstijd");
        int keuze = Integer.parseInt(IO.readln());

        if (keuze == 1) {
            IO.print("Geef het nieuw aantal personen: ");
            int nieuwAantal = Integer.parseInt(IO.readln());
            dc.wijzigAantalPersonen(index, nieuwAantal);
        } else {
            IO.print("Geef de nieuwe bereidingstijd: ");
            int nieuweTijd = Integer.parseInt(IO.readln());
            dc.wijzigBereidingstijd(index, nieuweTijd);
        }

        IO.println("Het recept werd aangepast!");
        IO.println(String.format("Het nieuwe recept is: %s%n", dc.geefRecept(index)));
    }
}