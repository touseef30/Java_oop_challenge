package org.joc.com;

public class Skin extends Organ{

    private String skin_color;
    private int softness;

    public Skin(String name, String med_condition, String skin_color, int softness) {
        super(name, med_condition);
        this.skin_color = skin_color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Color : " + this.getSkin_color());
        System.out.println("Softness : " + this.getSoftness());
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
