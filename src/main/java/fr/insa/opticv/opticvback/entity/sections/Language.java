package fr.insa.opticv.opticvback.entity.sections;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Language {
    private String name;
    private int level;
    @Id
    @GeneratedValue
    private Long id;

    public Language(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Language() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
