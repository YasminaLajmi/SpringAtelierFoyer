package tn.esprit.twin3.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Foyer {
    @Id
    @Generated
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;
}
