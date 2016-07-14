package com.company;

public class Main {

    public static void main(String[] args) throws InvalidDataException {
	// write your code here
        System.out.println("Entering valid details");
        Target.Builder  builderObj = new Target.Builder(1, "Jack", "Austin", "M", 30);
        builderObj.build();

        System.out.println("Entering invalid details");
        Target.Builder  builderObj2 = new Target.Builder(2, "Jill", "", "J", 90);
        builderObj2.build();

    }
}
