package com.company;

public class Main {

    public static void main(String[] args) {

        Marathon<Double, Integer> marathon1 = new Marathon<>(42.195, 20);
        Marathon<Double, Integer> marathon2 = new Marathon<>(21.975, 15);

        time(marathon1);
        time2(marathon2);
    }

    public static void time(Marathon<? extends Number, ? extends Number> r1) {
        System.out.println("Бегун  пробежал марафон за " + r1.getDistance().doubleValue()/r1.getSpeed().doubleValue() + "ч");

    }

    public static void time2(Marathon<? extends Number, ? extends Number> r2){
        System.out.println("Бегун  пробежал полумарафон за " + r2.getDistance().doubleValue()/r2.getSpeed().doubleValue() + "ч");
    }
}
