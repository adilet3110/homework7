package com.company;

public class Main {

    public static void main(String[] args) {
        Ferrari fr = new Ferrari();
        fr.carType();
        fr.carSpeed();
        printInfo(fr);

        Cruiser200 cr = new Cruiser200();
        cr.carType();
        cr.carSpeed();

        printInfo(cr);


    }

    public static void printInfo(Car a) {
        System.out.println(a.getColor() + " " + a.getVolume() + " " + a.getYear());
    }
}






