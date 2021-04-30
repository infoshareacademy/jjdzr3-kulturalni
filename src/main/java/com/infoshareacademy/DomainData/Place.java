package com.infoshareacademy.DomainData;

import java.util.Objects;

public class Place {
    private Integer id;
    private String subname;
    private String name;


    ////////////////////////////////HASHCODE & EQUALS/////////////////////////


    public Place(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;
        Place place = (Place) o;
        return Objects.equals(id, place.id) && Objects.equals(subname, place.subname) && Objects.equals(name, place.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subname, name);
    }


    ////////////////////////////////SETTERS & GETTERS/////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
