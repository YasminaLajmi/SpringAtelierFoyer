package tn.esprit.twin3.endpoints;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Universite;
import tn.esprit.twin3.services.IUniversiteService;

import java.util.List;

@RequestMapping("/universite")
@RestController
@AllArgsConstructor
public class UniversiteEndpoint {

    private IUniversiteService service;

    @GetMapping("")
    public List<Universite> findAllUniversities() {
        return service.retrieveAllUniversities();
    }

    @GetMapping("/byId/{id}")
    public Universite findUniversityById(@PathVariable long id) {
        return service.retrieveUniversity(id);
    }
    @PostMapping("")
    public Universite addUniversity(@RequestBody Universite u) {
        return service.addUniversity(u);
    }

    @PutMapping("")
    public Universite updateUniversitiy(@RequestBody Universite u) {
        return service.updateUniversity(u);
    }


    @PutMapping("/affecterFoyer/{nomUniversite}/{idFoyer}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer,@PathVariable String nomUniversite){
        return service.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }

    @PutMapping("/desaffecterFoyer/{idUniversite}")
    public Universite desaffecterFoyerAUniversite(@PathVariable long idUniversite){
        return service.desaffecterFoyerAUniversite(idUniversite);
    }
}
