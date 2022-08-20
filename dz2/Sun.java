package com.kda.dz2;

public class Sun extends Star {

    private int temperature;

    public Sun(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "temperature=" + temperature +
                '}';
    }
}
