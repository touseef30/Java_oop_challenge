package org.joc.com;

public class Eye extends Organ{

    private String eye_color;
    private boolean isOpened;

    public Eye(String name, String med_condition, String eye_color, boolean isOpened) {
        super(name, med_condition);
        this.eye_color = eye_color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye Color : " + getEye_color());
    }

    public void open(){
        this.setOpened(true);
        System.out.println(this.getName() + " Opened");
    }
    public void closed(){
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }
    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
