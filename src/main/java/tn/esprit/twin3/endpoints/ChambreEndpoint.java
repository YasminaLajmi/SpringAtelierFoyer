package tn.esprit.twin3.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Chambre;
import tn.esprit.twin3.services.IChambreService;

import java.util.List;

@RequestMapping("/chambre")
@RestController
@AllArgsConstructor
public class ChambreEndpoint {

    IChambreService service;

    @GetMapping("")
    public List<Chambre> findAllChambre(){
        return service.retrieveAllChambres();
    }

    @GetMapping("/byId/{id}")
    public Chambre findChambreById(@PathVariable long id) {
        return service.retrieveChambre(id);
    }
    @PostMapping("")
    public Chambre addChambre(@RequestBody Chambre c) {
        return service.addChambre(c);
    }

    @PutMapping("")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return service.updateChambre(c);
    }

}
