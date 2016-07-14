package com.company;

/**
 * Created by disachde on 7/13/2016.
 */
public class Target {

    private int targetID; //mandatory
    private String targetName;
    private String targetAddress;
    private String targetGender;
    private int targetAge;


    public Target(Builder builder)
    {
        targetID =builder.id;
        targetName=builder.name;
        targetAddress=builder.address;
        targetGender=builder.gender;
        targetAge=builder.age;
    }


    private boolean isValid() throws InvalidDataException
    {
        try
        {
            if ((targetID == 0) || (targetName.isEmpty())|| (targetAddress.isEmpty()))
                throw new InvalidDataException();
            if(!(targetGender.equals("Male")||targetGender.equals("Female")||targetGender.equals("M")||targetGender.equals("F")))
                throw new InvalidDataException();
            if (targetAge<18&&targetAge>60)
            {throw new InvalidDataException();}
            else
                return true;
        }

        catch (InvalidDataException e)
        {
            System.out.println("Invalid data");
            return false;
        }
    }

    public static class Builder
    {
        private int id; //mandatory
        private String name;
        private String address;
        private String gender;
        private int age;

        public Builder(int id, String name, String address, String gender, int age)
        {
                this.setID(id);
                this.setName(name);
                this.setAddress(address);
                this.setGender(gender);
                this.setAge(age);
        }

        public void setID(int id)
        {
            this.id=id;
        }

        public void setName(String name)
        {
            this.name=name;
        }

        public void setAddress(String address)
        {
            this.address=address;
        }

        public void setGender(String gender)
        {
            this.gender=gender;
        }

        public void setAge(int age)
        {
            this.age=age;
        }

        public Target build() throws InvalidDataException {
            Target targetObject = new Target(this);
            if (targetObject.isValid())
            {
                System.out.println("Object was built successfully");
                return targetObject;
            }
            else
            {System.out.println("Object was not built successfully as isValid returned false");
                return null;}

        }
    }


}
