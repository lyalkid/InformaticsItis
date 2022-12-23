package ru.itis.lab14;

import java.security.PublicKey;

public class Person {
    private String name;
    private String birthDate;
    private Integer height;

    private Person(){
    }

    public Person(String name, String birthDate, Integer height ){
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;

    }

    /*public int  compare(Person p){
        if (p == null) return 1;
        if (this == p) return 0;
        if (p.getHeight() == null) return (-1);
        if (p.getHeight() == null) return (-1);
        if (p.getHeight() == null) return (-1);
        if (p.getHeight() == null) return (-1);
    }*/

    public String getName(){
            return name;
    }

    public Integer getHeight(){
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }


}
