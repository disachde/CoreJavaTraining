package com.company;

/**
 * Created by DISACHDE on 7/12/2016.
 */
public class TrafficCamera implements Photographer{
    @Override
    public void prepareScene() {
        System.out.println("Take the image of the driver and the number plate");
    }

    @Override
    public String takePhotograph() {
        return "When red light is crossed";
    }
}
