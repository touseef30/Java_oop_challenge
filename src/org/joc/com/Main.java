package org.joc.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(
                "Bill", 25,
                new Eye("Left Eye","Okay", "Brown", true),
                new Eye("Right Eye", "Short Sighted", "Brown", true),
                new Heart("Heart", "Okay", 75),
                new Skin("Skin", "Okay", "Black", 6),
                new Stomach("Stomach", "Acidity", false)
                );
        System.out.println("Patient : " + patient.getName());
        System.out.println("Age : " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        while(!quit){
            System.out.println("Choose an Organ : " + "\n\t1. Left Eye" + "\n\t2. Right Eye \n\t3. Heart \n\t4.Skin \n\t5.Stomach \n\t6. Quit");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLeft_eye().getDetails();
                    if (patient.getLeft_eye().isOpened()) {
                        System.out.println("/t/t1. Close the eye");

                        if (scanner.nextInt() == 1) {
                            patient.getLeft_eye().closed();
                            System.out.println("Eye is closed");
                        }
                        else {
                            continue;
                        }
                    }
                    else{
                        System.out.println("/t/t1. Open the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeft_eye().open();
                            System.out.println("Eye is opened");
                        }
                        else{
                            continue;
                        }
                    }
                    break;

                case 2:
                    patient.getRight_eye().getDetails();
                    if (patient.getRight_eye().isOpened()) {
                        System.out.println("/t/t1. Close the eye");

                        if (scanner.nextInt() == 1) {
                            patient.getRight_eye().closed();
                            System.out.println("Eye is closed");
                        }
                        else {
                            continue;
                        }
                    }
                    else{
                        System.out.println("/t/t1. Open the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRight_eye().open();
                            System.out.println("Eye is opened");
                        }
                        else{
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("/t/t1. Change the heart rate");
                    if (scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate : ");
                        int new_heart_rate = scanner.nextInt();
                        patient.getHeart().setHeart_rate(new_heart_rate);
                        System.out.println("Heart rate is changed to : " + patient.getHeart().getHeart_rate());
                    }
                    else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("/t/t1.Digest");
                    if (scanner.nextInt() == 1){
                        System.out.println("Digestion start");
                        patient.getStomach().digest();
                    }
                    else{
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    quit=true;
                    break;
            }
        }

    }
}
