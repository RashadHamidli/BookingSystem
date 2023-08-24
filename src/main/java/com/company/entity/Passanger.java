package com.company.entity;

import java.util.Objects;

public class Passanger {
    private static final long serialVersionUID=1l;
    private final int id;
    private static int idCount=1;
    private final String name;
    private final String surname;

    public Passanger(String name, String surname) {
        this.id=idCount++;
        this.name = name;
        this.surname = surname;
    }

    public Passanger(int id, String name, String surname) {
        idCount = id;
        this.id=id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passanger passanger = (Passanger) o;
        return id == passanger.id && Objects.equals(name, passanger.name) && Objects.equals(surname, passanger.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }
}
