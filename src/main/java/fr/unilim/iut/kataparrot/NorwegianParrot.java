package fr.unilim.iut.kataparrot;

public class NorwegianParrot extends Parrot{

    private final double MAX_SPEED = 24.0;
    private double voltage;


    public NorwegianParrot(double voltage) {
        super();
        this.voltage=voltage;
    }

    @Override
    public double getSpeed() {
        return Math.min(MAX_SPEED, this.voltage * BASE_SPEED);
    }
}
