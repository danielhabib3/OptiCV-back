package fr.insa.opticv.opticvback.service;

import fr.insa.opticv.opticvback.entity.Data;
import fr.insa.opticv.opticvback.repository.CVRepository;
import fr.insa.opticv.opticvback.repository.DataRepository;
import fr.insa.opticv.opticvback.repository.UserRepository;
import fr.insa.opticv.opticvback.repository.sections.*;
import org.springframework.stereotype.Service;

@Service
public class CleanDatabaseService {

    private final UserRepository userRepository;
    private final DataRepository dataRepository;
    private final CVRepository cvRepository;
    private final HardSkillRepository hardSkillRepository;
    private final LanguageRepository languageRepository;
    private final ProjectRepository projectRepository;
    private final SoftSkillRepository softSkillRepository;
    private final ExperienceRepository experienceRepository;
    private final EducationRepository educationRepository;
    private final ContactInfoRepository contactInfoRepository;


    public CleanDatabaseService(UserRepository userRepository, DataRepository dataRepository, CVRepository cvRepository, HardSkillRepository hardSkillRepository, LanguageRepository languageRepository, ProjectRepository projectRepository, SoftSkillRepository softSkillRepository, ExperienceRepository experienceRepository, EducationRepository educationRepository, ContactInfoRepository contactInfoRepository) {
        this.userRepository = userRepository;
        this.dataRepository = dataRepository;
        this.cvRepository = cvRepository;
        this.hardSkillRepository = hardSkillRepository;
        this.languageRepository = languageRepository;
        this.projectRepository = projectRepository;
        this.softSkillRepository = softSkillRepository;
        this.experienceRepository = experienceRepository;
        this.educationRepository = educationRepository;
        this.contactInfoRepository = contactInfoRepository;
    }


    public void cleanDatabase() {
        // Delete all data from the database
        contactInfoRepository.deleteAll();
        experienceRepository.deleteAll();
        educationRepository.deleteAll();
        projectRepository.deleteAll();
        softSkillRepository.deleteAll();
        languageRepository.deleteAll();
        hardSkillRepository.deleteAll();
        cvRepository.deleteAll();
        dataRepository.deleteAll();
        userRepository.deleteAll();
    }
}
