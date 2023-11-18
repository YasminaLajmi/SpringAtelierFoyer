package tn.esprit.twin3.services;

import tn.esprit.twin3.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation addReservation (Reservation res);
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);
}
