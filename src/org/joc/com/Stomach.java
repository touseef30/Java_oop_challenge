package org.joc.com;

public class Stomach extends Organ{

    private boolean isEmpty;

    public Stomach(String name, String med_condition, boolean isEmpty) {
        super(name, med_condition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if (this.isEmpty()){
            System.out.println("Need to be feed");
        }
        else{
            System.out.println("Stomach is full");
        }
    }

    public void digest(){
        System.out.println("Digestion begins...");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
