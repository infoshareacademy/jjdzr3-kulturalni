package com.infoshareacademy.DomainData;

import java.util.Objects;

public class Organizer {

    private Integer id;
    private String designation;

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organizer)) return false;
        Organizer organizer = (Organizer) o;
        return Objects.equals(id, organizer.id) && Objects.equals(designation, organizer.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation);
    }

    ////////////////////////////////SETTERS & GETTERS/////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
