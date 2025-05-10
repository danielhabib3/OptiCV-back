package fr.insa.opticv.opticvback.service.sections;

import fr.insa.opticv.opticvback.entity.sections.HardSkill;
import fr.insa.opticv.opticvback.repository.sections.HardSkillRepository;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService {


    private final HardSkillRepository repo;

    public HardSkillService(HardSkillRepository repo) {
        this.repo = repo;
    }

    public HardSkill save(HardSkill hardSkill) {
        return repo.save(hardSkill);
    }
}
