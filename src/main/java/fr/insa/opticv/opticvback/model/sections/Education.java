package fr.insa.opticv.opticvback.model.sections;

import java.util.Date;

public class Education {
    private String title;
    private String school;
    private Date startDate;
    private Date endDate;
    private String description;
    private String logo;

    public Education(String title, String school, Date startDate, Date endDate, String description, String logo) {
        this.title = title;
        this.school = school;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
