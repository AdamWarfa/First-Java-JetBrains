package org.example;

import java.time.LocalDate;

public class Student {
    private int ID;
    private String name;
    private LocalDate born;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", born=" + born +
                '}';
    }
}
