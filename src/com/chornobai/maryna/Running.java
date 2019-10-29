package com.chornobai.maryna;

public class Running extends Hobby {
    private int distance;

    public Running(String name, int age, int distance) {
        super(name, age);
        this.distance = distance;
    }

    @Override
    void tellAboutHobby(int i) throws  HobbyException {
        System.out.println("Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + "Running{" +
                "distance=" + distance +
                '}');
    }
}
