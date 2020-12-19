package org.joc.com;

import java.sql.SQLOutput;

public class Organ {
    private String name;
    private String med_condition;

    public Organ(String name, String med_condition) {
        this.name = name;
        this.med_condition = med_condition;
    }
    public void getDetails(){
        System.out.println("Name : " + this.getName() );
        System.out.println("Medical Condition : " + this.getMed_condition());
    }

    public String getMed_condition() {
        return med_condition;
    }

    public void setMed_condition(String med_condition) {
        this.med_condition = med_condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
