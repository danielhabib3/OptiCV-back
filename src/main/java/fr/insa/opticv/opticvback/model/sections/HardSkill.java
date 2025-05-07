package fr.insa.opticv.opticvback.model.sections;

public class HardSkill {
    private String name;
    private String logo;
    private int level;

    public HardSkill(String name, String logo, int level) {
        this.name = name;
        this.logo = logo;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
