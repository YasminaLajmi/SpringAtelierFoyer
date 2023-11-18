package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Etudiant;
import tn.esprit.twin3.respositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{

    private EtudiantRepository repo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return repo.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return repo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return repo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        repo.deleteById(idEtudiant);
    }
}
