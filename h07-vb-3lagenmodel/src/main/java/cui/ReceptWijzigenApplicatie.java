package cui;

import domein.DomeinController;
import java.util.Scanner;

public class ReceptWijzigenApplicatie {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        DomeinController dc = new DomeinController();

        String[] recepten = dc.geefAlleRecepten();
        for (int i = 0; i < recepten.length; i++) {
            System.out.println((i + 1) + ". " + recepten[i]);
        }

        System.out.print("Welk recept wil je wijzigen? Geef het nummer uit de lijst: ");
        int gekozenNummer = scanner.nextInt();
        int index = gekozenNummer - 1;

        System.out.println("Wat wil je wijzigen? Kies 1 voor aantal personen of 2 voor bereidingstijd");
        int keuze = scanner.nextInt();

        if (keuze == 1) {
            System.out.print("Geef het nieuw aantal personen: ");
            int nieuwAantal = scanner.nextInt();
            dc.wijzigAantalPersonen(index, nieuwAantal);
        } else {
            System.out.print("Geef de nieuwe bereidingstijd: ");
            int nieuweTijd = scanner.nextInt();
            dc.wijzigBereidingstijd(index, nieuweTijd);
        }

        System.out.println("Het recept werd aangepast!");
        System.out.printf("Het nieuwe recept is: %s%n", dc.geefRecept(dc.geefAantalRecepten() - 1));
    }
}