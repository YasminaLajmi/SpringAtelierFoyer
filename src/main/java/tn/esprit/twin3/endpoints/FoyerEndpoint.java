package tn.esprit.twin3.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Foyer;
import tn.esprit.twin3.entities.Reservation;
import tn.esprit.twin3.services.IFoyerService;

import java.util.List;

@RequestMapping("/foyer")
@RestController
@AllArgsConstructor
public class FoyerEndpoint {

    IFoyerService service;

    @GetMapping("")
    public List<Foyer> findAllFoyer(){
        return service.retrieveAllFoyers();
    }

    @GetMapping("/byId/{id}")
    public Foyer findFoyerById(@PathVariable long id) {
        return service.retrieveFoyer(id);
    }
    @PostMapping("")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return service.addFoyer(f);
    }

    @PutMapping("")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return service.updateFoyer(f);
    }

    @DeleteMapping("delete/{id}")
    public void deleteFoyer(@PathVariable long id){
        service.removeFoyer(id);
    }
}
