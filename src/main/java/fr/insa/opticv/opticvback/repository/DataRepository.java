package fr.insa.opticv.opticvback.repository;

import fr.insa.opticv.opticvback.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
}
