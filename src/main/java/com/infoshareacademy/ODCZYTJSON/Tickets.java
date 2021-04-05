package com.infoshareacademy.ODCZYTJSON;

import java.util.Objects;

public class Tickets {

    private String type;

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tickets)) return false;
        Tickets tickets = (Tickets) o;
        return Objects.equals(type, tickets.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    ////////////////////////////////SETTERS & GETTERS/////////////////////////

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
