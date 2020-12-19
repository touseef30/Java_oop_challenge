package org.joc.com;

public class Heart extends Organ{

    private int heart_rate;

    public Heart(String name, String med_condition, int heart_rate) {
        super(name, med_condition);
        this.heart_rate = heart_rate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate : " + this.getHeart_rate());
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }
}
