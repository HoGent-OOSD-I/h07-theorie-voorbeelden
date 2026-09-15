package cui;

import domein.DomeinController;
import java.util.Scanner;

public class ReceptToevoegenApplicatie {
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        DomeinController dc = new DomeinController();

        System.out.printf("Het aantal recepten in de database is nu: %d%n", dc.geefAantalRecepten());

        System.out.println("We gaan nu een recept toevoegen");
        System.out.print("Naam recept: ");
        String naam = scanner.nextLine();

        System.out.print("Bereidingstijd (min): ");
        int tijd = scanner.nextInt();

        System.out.print("Aantal personen: ");
        int personen = scanner.nextInt();

        dc.voegReceptToe(naam, tijd, personen);
        System.out.println("Het recept werd toegevoegd!");
        System.out.printf("Het aantal recepten in de database is nu: %d%n", dc.geefAantalRecepten());
    }
}
