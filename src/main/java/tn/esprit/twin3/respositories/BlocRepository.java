package tn.esprit.twin3.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.twin3.entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
