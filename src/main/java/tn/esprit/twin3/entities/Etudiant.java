package tn.esprit.twin3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @JoinTable(name = "Reservation_Etudiant",
    joinColumns = @JoinColumn(
            name = "etudiant_id",
            referencedColumnName = "idEtudiant"
    ),
    inverseJoinColumns = @JoinColumn(
            name = "reservation_id",
            referencedColumnName = "idReservation"
    ))
    @ManyToMany
    private List<Reservation> reservations;
}
