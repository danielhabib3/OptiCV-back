package fr.insa.opticv.opticvback.model.sections;

public class ContactInfo {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String linkedIn;
    private String github;
    private String website;
    private String photo;
    private String description;

    public ContactInfo(String name, String email, String phone, String address, String linkedIn, String github, String website, String photo, String description) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.linkedIn = linkedIn;
        this.github = github;
        this.website = website;
        this.photo = photo;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
