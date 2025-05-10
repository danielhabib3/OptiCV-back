package fr.insa.opticv.opticvback.entity;

import fr.insa.opticv.opticvback.entity.sections.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Data {
    @OneToMany
    private List<Education> educations;
    @OneToMany
    private List<Experience> experiences;
    @OneToMany
    private List<HardSkill> hardSkills;
    @OneToMany
    private List<SoftSkill> softSkills;
    @OneToMany
    private List<Project> projects;
    @OneToOne
    @JoinColumn(name = "contact_info_id")
    private ContactInfo contactInfo;
    @OneToMany
    private List<Language> languages;
    @Id
    @GeneratedValue
    private Long id;

    public Data(List<Education> educations, List<Experience> experiences, List<HardSkill> hardSkills, List<SoftSkill> softSkills, List<Project> projects, ContactInfo contactInfo, List<Language> languages) {
        this.educations = educations;
        this.experiences = experiences;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.projects = projects;
        this.contactInfo = contactInfo;
        this.languages = languages;
    }

    public Data() {

    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<HardSkill> getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(List<HardSkill> hardSkills) {
        this.hardSkills = hardSkills;
    }

    public List<SoftSkill> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<SoftSkill> softSkills) {
        this.softSkills = softSkills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
