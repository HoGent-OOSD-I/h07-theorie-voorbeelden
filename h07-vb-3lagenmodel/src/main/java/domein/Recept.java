package domein;

public class Recept {
    private final String naam;
    private int bereidingstijd; // in minuten
    private int aantalPersonen;

    private static final int MIN_BEREIDINGSTIJD = 10;
    private static final int MAX_BEREIDINGSTIJD = 300;
    private static final int MIN_AANTALPERSONEN = 1;
    private static final int MAX_AANTALPERSONEN = 12;

    public Recept(String naam, int bereidingstijd, int aantalPersonen) {
        controleerNaam(naam);
        this.naam = naam;
        setBereidingstijd(bereidingstijd);
        setAantalPersonen(aantalPersonen);
    }

    private void controleerNaam(String naam) {
        if (naam == null || naam.isBlank())
            throw new IllegalArgumentException("Naam moet ingevuld zijn");
    }

    public final void setBereidingstijd(int bereidingstijd) {
        if (bereidingstijd < MIN_BEREIDINGSTIJD || bereidingstijd > MAX_BEREIDINGSTIJD) {
            throw new IllegalArgumentException(String.format(
                    "Bereidingstijd moet tussen %d en %d minuten liggen", MIN_BEREIDINGSTIJD, MAX_BEREIDINGSTIJD));
        }
        this.bereidingstijd = bereidingstijd;
    }

    public final void setAantalPersonen(int aantalPersonen) {
        if (aantalPersonen < MIN_AANTALPERSONEN || aantalPersonen > MAX_AANTALPERSONEN) {
            throw new IllegalArgumentException(String.format(
                    "Aantal personen moet tussen %d en %d liggen", MIN_AANTALPERSONEN, MAX_AANTALPERSONEN));
        }
        this.aantalPersonen = aantalPersonen;
    }

    public String getNaam() { return naam; }
    public int getBereidingstijd() { return bereidingstijd; }
    public int getAantalPersonen() { return aantalPersonen; }

    @Override
    public String toString() {
        return naam + " (" + aantalPersonen + " personen) " + bereidingstijd + " min";
    }
}
