package com.chornobai.maryna;

public class Football extends Hobby {
    private int number;

    public Football(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    @Override
    void tellAboutHobby(int i)  throws HobbyException{
        if(i < 0) throw new HobbyException();
        System.out.println("Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "Football{" +
                "number=" + number +
                '}');
    }

    void exceptionHandling() {
        try {
            tellAboutHobby(-1);
        }
        catch (HobbyException e) {
            System.out.println("Error: negative number!");
        }
    }
}
