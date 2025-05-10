package fr.insa.opticv.opticvback.repository.sections;

import fr.insa.opticv.opticvback.entity.sections.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {
}
