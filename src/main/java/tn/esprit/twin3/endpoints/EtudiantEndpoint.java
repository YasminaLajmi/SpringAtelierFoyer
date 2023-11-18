package tn.esprit.twin3.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Etudiant;
import tn.esprit.twin3.services.IEtudiantService;

import java.util.List;

@RequestMapping("/etudiant")
@RestController
@AllArgsConstructor
public class EtudiantEndpoint {
    IEtudiantService service;

    @GetMapping("/afficher")
    public List<Etudiant> findAllEtudiant(){
        return service.retrieveAllEtudiants();
    }

    @GetMapping("/byId/{id}")
    public Etudiant findEtudiantById(@PathVariable long id) {
        return service.retrieveEtudiant(id);
    }
    @PostMapping("")
    public List<Etudiant> addEtudiant(@RequestBody List<Etudiant> e) {
        return service.addEtudiants(e);
    }

    @PutMapping("")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return service.updateEtudiant(e);
    }

    @DeleteMapping("delete/{id}")
    public void deleteEtudiant(@PathVariable long id){
        service.removeEtudiant(id);
    }
}
