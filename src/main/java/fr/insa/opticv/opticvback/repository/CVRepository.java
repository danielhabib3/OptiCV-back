package fr.insa.opticv.opticvback.repository;

import fr.insa.opticv.opticvback.entity.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVRepository extends JpaRepository<CV, Long> {
}
