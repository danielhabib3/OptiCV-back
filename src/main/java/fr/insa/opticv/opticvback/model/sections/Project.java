package fr.insa.opticv.opticvback.model.sections;

public class Project {
    private String title;
    private String description;
    private String logo;
    private String link;

    public Project(String title, String description, String logo, String link) {
        this.title = title;
        this.description = description;
        this.logo = logo;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
