package com.company;

import enity.Pupil;
import enity.Sex;
import io.PupilsWriter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pupil p1=new Pupil("Ivan", "Ivanov", Sex.MALE, 8.2);
        Pupil p2=new Pupil("Tatiana", "Ivanova", Sex.FEMALE, 9.2);
        Pupil p3=new Pupil("Petr", "Petrov", Sex.MALE, 5.8);

        List<Pupil> pupils=new ArrayList<>();
        pupils.add(p1);
        pupils.add(p2);
        pupils.add(p3);
        System.out.println(pupils);

        PupilsWriter.write(pupils);

    }
}
