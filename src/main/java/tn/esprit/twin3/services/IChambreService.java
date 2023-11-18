package tn.esprit.twin3.services;

import tn.esprit.twin3.entities.Chambre;

import java.sql.Date;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
    List<Chambre> getChambreByReservationAnneUniversitaire(Date debut, Date fin);
}
