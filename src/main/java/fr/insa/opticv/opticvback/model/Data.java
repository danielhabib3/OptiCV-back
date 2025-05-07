package fr.insa.opticv.opticvback.model;

import fr.insa.opticv.opticvback.model.sections.*;

import java.util.List;

public class Data {
    private List<Education> educations;
    private List<Experience> experiences;
    private List<HardSkill> hardSkills;
    private List<SoftSkill> softSkills;
    private List<Project> projects;
    private ContactInfo contactInfo;
    private List<Language> languages;

    public Data(List<Education> educations, List<Experience> experiences, List<HardSkill> hardSkills, List<SoftSkill> softSkills, List<Project> projects, ContactInfo contactInfo, List<Language> languages) {
        this.educations = educations;
        this.experiences = experiences;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.projects = projects;
        this.contactInfo = contactInfo;
        this.languages = languages;
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

}
