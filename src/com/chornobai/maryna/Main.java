package com.chornobai.maryna;

public class Main {

    public static void main(String[] args) throws HobbyException {
        
        Football hobby1 = new Football("Football", 6, 25);
        Running hobby2 = new Running("Running", 8, 200);
        Football hobby3 = new Football("Football", 10, 83);

        int i = 1;

        Hobby[] arrayHobby = {hobby1, hobby2, hobby3};
        for (Hobby var: arrayHobby) {
            var.tellAboutHobby(i);
        }

        hobby1.exceptionHandling();
        }
}

