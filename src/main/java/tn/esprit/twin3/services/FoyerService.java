package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Foyer;
import tn.esprit.twin3.respositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor()
public class FoyerService implements IFoyerService{

    private FoyerRepository repo;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return repo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return repo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return repo.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        repo.deleteById(idFoyer);
    }
}
