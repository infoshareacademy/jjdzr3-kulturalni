package com.infoshareacademy.ODCZYTJSON;

import java.util.Arrays;
import java.util.Objects;

public class Attachments{
    Attachments attachments;

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

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }
}