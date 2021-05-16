package com.infoshareacademy.DomainData;

import java.util.Objects;

public class URLs {
    private String www;

    public URLs(String urls) {
    }

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof URLs)) return false;
        URLs urLs = (URLs) o;
        return Objects.equals(www, urLs.www);
    }

    @Override
    public int hashCode() {
        return Objects.hash(www);
    }

    ////////////////////////////////HASHCODE & EQUALS/////////////////////////

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }
}
