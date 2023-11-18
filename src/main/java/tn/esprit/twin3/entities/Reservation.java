package tn.esprit.twin3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Reservation {
    @Id
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
}
