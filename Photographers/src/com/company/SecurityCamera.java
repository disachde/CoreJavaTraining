package com.company;

/**
 * Created by DISACHDE on 7/12/2016.
 */
public class SecurityCamera implements Photographer {

    @Override
    public void prepareScene() {
        System.out.println("Scan the image of the face");

    }

    @Override
    public String takePhotograph() {
        return "Click when user enters restricted access area";
    }
}
