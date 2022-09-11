package model;

import enums.ClassType;

public class People extends Type {

    private String name;
    private String email;

    public People(ClassType type) {
        super(type);
    }

    public People withName(String name) {
        this.name = name;
        return this;
    }

    public People withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public People build() {
        return this;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Email: " + email;
    }
}
