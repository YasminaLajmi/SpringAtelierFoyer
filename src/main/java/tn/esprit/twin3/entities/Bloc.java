package tn.esprit.twin3.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "foyer_id", referencedColumnName = "idFoyer")
    private Foyer foyer;
}
