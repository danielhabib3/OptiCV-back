package fr.insa.opticv.opticvback.controller.sections;

import fr.insa.opticv.opticvback.entity.sections.HardSkill;
import fr.insa.opticv.opticvback.service.sections.HardSkillService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hard-skills")
public class HardSkillController {
    private final HardSkillService hardSkillService;

    public HardSkillController(HardSkillService hardSkillService) {
        this.hardSkillService = hardSkillService;
    }

    @PostMapping
    public HardSkill createHardSkill(String hardSkillName, String level) {
        HardSkill hardSkill = new HardSkill();
        hardSkill.setName(hardSkillName);
        hardSkill.setLevel(Integer.parseInt(level));
        return hardSkillService.save(hardSkill);
    }
}
