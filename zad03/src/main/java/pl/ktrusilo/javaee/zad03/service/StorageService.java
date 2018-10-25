package pl.ktrusilo.javaee.zad03.service;

import java.util.ArrayList;
import java.util.List;

import pl.ktrusilo.javaee.zad03.domain.Wardrobe;

public class StorageService {

    private List<Wardrobe> db = new ArrayList<Wardrobe>();

    public void add(Wardrobe wardrobe) {
        Wardrobe newWardrobe = new Wardrobe(wardrobe.getName(), wardrobe.getProductionDate(), wardrobe.getWeight(), wardrobe.isWoodStatus());
        db.add(newWardrobe);
    }

    public List<Wardrobe> getAllWardrobes() {
        return db;
    }

}
