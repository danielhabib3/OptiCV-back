package fr.insa.opticv.opticvback.entity.sections;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HardSkill {
    private String name;
    private String logo;
    private int level;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public HardSkill(String name, String logo, int level) {
        this.name = name;
        this.logo = logo;
        this.level = level;
    }

    public HardSkill() {

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
