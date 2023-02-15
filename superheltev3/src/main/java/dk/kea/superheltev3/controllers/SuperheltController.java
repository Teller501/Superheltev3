package dk.kea.superheltev3.controllers;

import dk.kea.superheltev3.model.Superhelt;
import dk.kea.superheltev3.services.SuperheltService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("superhelte")
public class SuperheltController {

    private SuperheltService superheltService;

    public SuperheltController(SuperheltService superheltService){
        this.superheltService = superheltService;
    }

    @RequestMapping("/")
    public ResponseEntity<ArrayList<Superhelt>> printSuperhelte(){
        ArrayList<Superhelt> superhelte = superheltService.getSuperhelte();
        return new ResponseEntity<>(superhelte, HttpStatus.OK);
    }

    @RequestMapping(path = "/{navn}")
    public ResponseEntity<ArrayList<Superhelt>> printSpecifikSuperhelt(@PathVariable String navn){
        ArrayList<Superhelt> searchResults = superheltService.searchForSuperhero(navn);
        return new ResponseEntity<>(searchResults, HttpStatus.OK);
    }

    @PostMapping(path="/opret")
    public ResponseEntity<Superhelt> opretSuperhelt(@RequestBody String realName, String heroName,
                                                    int creationYear, String superPower, boolean isHuman, double power){
        Superhelt superhelt = superheltService.createSuperHero(realName, heroName, creationYear, superPower, isHuman, power);
        return new ResponseEntity<Superhelt>(superhelt, HttpStatus.CREATED);
    }
}
