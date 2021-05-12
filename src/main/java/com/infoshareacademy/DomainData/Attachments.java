package com.infoshareacademy.DomainData;

import java.util.Objects;

public class Attachments{
    String attachments;

////////////////////////////////HASHCODE & EQUALS/////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attachments)) return false;
        Attachments that = (Attachments) o;
        return Objects.equals(attachments, that.attachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments);
    }

////////////////////////////////SETTERS & GETTERS/////////////////////////

    public String  getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }
}