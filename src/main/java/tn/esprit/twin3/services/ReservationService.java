package tn.esprit.twin3.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin3.entities.Reservation;
import tn.esprit.twin3.respositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor()
public class ReservationService implements IReservationService{

    private ReservationRepository repo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (repo.findAll().isEmpty()) ? null : repo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return repo.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return repo.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return repo.findById(idReservation).orElse(null);
    }
}
