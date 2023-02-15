package dk.kea.superheltev3.repositories;

import dk.kea.superheltev3.model.Superhelt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class SuperheltRepository {

    Superhelt superhelt1 = new Superhelt("Bruce Wayne", "Batman", 1998, "Rig", true, 2.1);
    Superhelt superhelt2 = new Superhelt("Clark Kent", "Superman", 1975, "Flyve", true, 3.8);
    Superhelt superhelt3 = new Superhelt("Prinsesse Diana", "Wonder Woman", 1941, "Flyve", true, 3.1);
    Superhelt superhelt4 = new Superhelt("Peter Parker", "Spiderman", 1938, "Spinne", true, 2.1);
    private ArrayList<Superhelt> superhelte = new ArrayList<>(Arrays.asList(superhelt1,superhelt2,superhelt3,superhelt4));

    public ArrayList<Superhelt> getSuperhelte() {
        return superhelte;
    }

    public Superhelt createSuperHero(String realName, String heroName,
                                     int creationYear, String superPower, boolean isHuman, double power) {
        Superhelt newSuperHero = new Superhelt(realName, heroName, creationYear, superPower, isHuman, power);
        superhelte.add(newSuperHero);

        return newSuperHero;
    }

    public ArrayList<Superhelt> searchForSuperhero(String searchTerm) {
        ArrayList<Superhelt> searchResults = new ArrayList<>(); // creating arraylist of superheroes

        // Loop through arraylist of superheroes, return if matching searchTerm
        for (Superhelt superhelt : superhelte) {
            String name = superhelt.getHeroName().toLowerCase(); // making all characters in superhero name lower case
            if (name.contains(searchTerm.toLowerCase().trim())) { // if superhero contains searchTerm, add superhero to arraylist
                searchResults.add(superhelt);
            }
        }
        // return searchResult
        return searchResults;
    }
}
