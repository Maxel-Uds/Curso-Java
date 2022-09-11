package model;

import enums.ClassType;

public class People {

    private String name;
    private String email;
    private ClassType type;

    public People withName(String name) {
        this.name = name;
        return this;
    }

    public People withEmail(String email) {
        this.email = email;
        return this;
    }

    public People withType(ClassType type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ClassType getType() {
        return type;
    }

    public People build() {
        return this;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Email: " + email;
    }
}
