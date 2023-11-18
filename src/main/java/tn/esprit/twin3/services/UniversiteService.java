package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Universite;
import tn.esprit.twin3.respositories.FoyerRepository;
import tn.esprit.twin3.respositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor()
public class UniversiteService implements IUniversiteService{

    private UniversiteRepository repo;
    private FoyerRepository foyerRepo;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return repo.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return repo.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return repo.findById(idUniversity).orElse(null);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite u = repo.findUniversiteByNomUniversite(nomUniversite);
        u.setFoyer(foyerRepo.findById(idFoyer).orElse(null));
        return repo.save(u);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite u = repo.findById(idUniversite).orElse(null);
        u.setFoyer(null);
        return repo.save(u);
    }
}
