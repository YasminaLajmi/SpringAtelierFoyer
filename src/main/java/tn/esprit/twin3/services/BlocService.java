package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Bloc;
import tn.esprit.twin3.respositories.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor()
public class BlocService implements IBlocService{

    private BlocRepository repo;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return repo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return repo.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return repo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        repo.deleteById(idBloc);
    }
}
