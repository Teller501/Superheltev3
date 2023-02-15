package dk.kea.superheltev3.services;

import dk.kea.superheltev3.model.Superhelt;
import dk.kea.superheltev3.repositories.SuperheltRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;

    public SuperheltService(SuperheltRepository superheltRepository){
        this.superheltRepository = new SuperheltRepository();
    }

    public ArrayList<Superhelt> getSuperhelte(){
        return superheltRepository.getSuperhelte();
    }

    public ArrayList<Superhelt> searchForSuperhero(String searchTerm) {
        return superheltRepository.searchForSuperhero(searchTerm);
    }

    public Superhelt createSuperHero(String realName, String heroName,
                                     int creationYear, String superPower, boolean isHuman, double power) {
        return superheltRepository.createSuperHero(realName, heroName, creationYear, superPower, isHuman, power);
    }
}
