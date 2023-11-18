package tn.esprit.twin3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name="bloc_id", referencedColumnName = "idBloc")
    private Bloc bloc;

    @OneToMany
    private List<Reservation> reservations;

}
