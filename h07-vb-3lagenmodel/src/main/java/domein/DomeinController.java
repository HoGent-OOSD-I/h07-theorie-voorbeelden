package domein;

public class DomeinController {
    private final ReceptRepository repository = new ReceptRepository();

    public void voegReceptToe(String naam, int bereidingstijd, int aantalPersonen) {
        repository.voegToe(new Recept(naam, bereidingstijd, aantalPersonen));
    }

    public String[] geefAlleRecepten() {
        int aantal = geefAantalRecepten();
        String[] resultaat = new String[aantal];
        for (int i=0; i<aantal; i++)
            resultaat[i] = geefRecept(i);
        return resultaat;
    }

    public String geefRecept(int i) { return repository.geefRecept(i).toString(); }

    public int geefAantalRecepten() { return repository.geefAantalRecepten(); }

    public void wijzigAantalPersonen(int index, int nieuwAantal) {
        repository.wijzigAantalPersonen(index, nieuwAantal);
    }

    public void wijzigBereidingstijd(int index, int nieuweTijd) {
        repository.wijzigBereidingstijd(index, nieuweTijd);
    }
}