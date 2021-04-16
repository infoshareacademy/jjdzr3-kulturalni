package com.infoshareacademy.DomainData;

import java.util.Objects;

public class Id {

    ////////////////////////////////VARIABLES/////////////////////////

    private Integer id;

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id1 = (Id) o;
        return Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    ////////////////////////////////SETTERS & GETTERS/////////////////////////


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
