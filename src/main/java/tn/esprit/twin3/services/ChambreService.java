package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Chambre;
import tn.esprit.twin3.entities.Reservation;
import tn.esprit.twin3.respositories.ChambreRepository;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor()
public class ChambreService implements IChambreService{

    private ChambreRepository repo;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return repo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return repo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return repo.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambreByReservationAnneUniversitaire(Date debut, Date fin){
        List<Chambre> chambres = null;
        for(Chambre c : repo.findAll())
            for(Reservation r: c.getReservations())
                if (r.getAnneeUniversitaire().after(debut) && r.getAnneeUniversitaire().before(fin))
                    chambres.add(c);
        return chambres;
    }
}
