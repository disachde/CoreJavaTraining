package com.company;

import javafx.scene.paint.PhongMaterial;

public class Main {

    public static void main(String[] args) {

        Photographer[] p = new Photographer[3];
        p[0] = new FamilyCamera();
        p[1] = new TrafficCamera();
        p[2] = new SecurityCamera();

        for (Photographer element : p) {
            element.prepareScene();
            System.out.println(element.takePhotograph());
        }


    }
}
