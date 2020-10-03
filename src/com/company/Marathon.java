package com.company;

public class Marathon<T extends Number, S extends Number> implements Runnable<T,S> {
    private T distance;
    private S speed;

    public Marathon(T distance, S speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public T getDistance() {
        return distance;
    }

    public S getSpeed() {
        return speed;
    }

    @Override
    public void runner(T distance, S speed) {
        double time = distance.doubleValue()/speed.doubleValue();

    }
}
