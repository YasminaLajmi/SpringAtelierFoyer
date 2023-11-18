package tn.esprit.twin3.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.entities.Bloc;
import tn.esprit.twin3.services.IBlocService;

import java.util.List;

@RequestMapping("/bloc")
@RestController
@AllArgsConstructor
public class BlocEndpoint {

    IBlocService service;

    @GetMapping("")
    public List<Bloc> findAllBloc(){
        return service.retrieveBlocs();
    }
    @GetMapping("/byId/{id}")
    public Bloc findBlocById(@PathVariable long id) {
        return service.retrieveBloc(id);
    }
    @PostMapping("")
    public Bloc addBloc(@RequestBody Bloc b) {
        return service.addBloc(b);
    }

    @PutMapping("")
    public Bloc updateBloc(@RequestBody Bloc b) {
        return service.updateBloc(b);
    }

    @DeleteMapping("delete/{id}")
    public void deleteBloc(@PathVariable long id){
        service.removeBloc(id);
    }
}
