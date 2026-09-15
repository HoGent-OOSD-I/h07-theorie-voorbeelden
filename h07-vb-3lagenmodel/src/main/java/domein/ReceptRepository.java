package domein;

import persistentie.ReceptMapper;
import java.util.List;

public class ReceptRepository {
    private final List<Recept> recepten;

    public ReceptRepository() {
        recepten = new ReceptMapper().geefRecepten();
    }

    public void voegToe(Recept recept) {
        for (Recept r : recepten) {
            if (r.getNaam().equalsIgnoreCase(recept.getNaam())) {
                throw new IllegalArgumentException("Recept '" + recept.getNaam() + "' bestaat al");
            }
        }
        recepten.add(recept);
    }

    public Recept geefRecept(int index) { return recepten.get(index); }

    public int geefAantalRecepten() { return recepten.size(); }

    private Recept geefReceptOpIndex(int index) {
        if (index < 0 || index >= recepten.size())
            throw new IllegalArgumentException("Ongeldig nummer: " + (index + 1));
        return recepten.get(index);
    }

    public void wijzigAantalPersonen(int index, int nieuwAantal) {
        geefReceptOpIndex(index).setAantalPersonen(nieuwAantal);
    }

    public void wijzigBereidingstijd(int index, int nieuweTijd) {
        geefReceptOpIndex(index).setBereidingstijd(nieuweTijd);
    }
}