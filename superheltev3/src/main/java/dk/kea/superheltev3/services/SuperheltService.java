package dk.kea.superheltev3.services;

import dk.kea.superheltev3.model.Superhelt;
import dk.kea.superheltev3.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;

    public SuperheltService(SuperheltRepository superheltRepository){
        this.superheltRepository = superheltRepository;
    }

    public List<Superhelt> getSuperhelte(){
        return superheltRepository.getSuperhelte();
    }

    public List<Superhelt> searchForSuperhero(String searchTerm) {
        return superheltRepository.searchForSuperhero(searchTerm);
    }

    public Superhelt createSuperHero(String realName, String heroName,
                                     int creationYear, String superPower, boolean isHuman, double power) {
        return superheltRepository.createSuperHero(realName, heroName, creationYear, superPower, isHuman, power);
    }

    public List<Superhelt> deleteSuperhero(String searchTerm){
        return superheltRepository.deleteSuperhero(searchTerm);
    }

    public void editSuperhero(Superhelt superhelt, String newRealName, String newHeroName, int newCreationYear, String newSuperPower, boolean newIsHuman, double newPower){
        superheltRepository.editSuperhero(superhelt, newRealName, newHeroName, newCreationYear, newSuperPower, newIsHuman, newPower);
    }
}
