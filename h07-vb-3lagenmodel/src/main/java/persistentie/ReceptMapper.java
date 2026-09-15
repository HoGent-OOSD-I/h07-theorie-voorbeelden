package persistentie;

import domein.Recept;

import java.util.*;

public class ReceptMapper {

    public List<Recept> geefRecepten() {
        List<Recept> recepten = new ArrayList<>();

        recepten.add(new Recept("Spaghetti bolognese", 45, 4));
        recepten.add(new Recept("Kip curry", 30, 2));
        recepten.add(new Recept("Vegetarische lasagne", 60, 6));
        recepten.add(new Recept("Tomatensoep", 25, 4));
        recepten.add(new Recept("Pannenkoeken", 20, 8));

        return recepten;
    }
}
