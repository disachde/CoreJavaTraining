package com.company;

/**
 * Created by DISACHDE on 7/12/2016.
 */
public class FamilyCamera implements Photographer {

    @Override
    public void prepareScene() {

    System.out.println("Hey, stand there and smile!");
    }

    @Override
    public String takePhotograph() {

        return "When everyone says Cheese";
    }
}
