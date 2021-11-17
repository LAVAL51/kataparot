package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot{

    private final double LOAD_FACTOR = 9.0;

    private int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconut) {
        super();
        this.numberOfCoconuts=numberOfCoconut;
    }

    @Override
    public double getSpeed() {
        return Math.max(MIN_SPEED, BASE_SPEED - LOAD_FACTOR * this.numberOfCoconuts);
    }

    public double getLoadFactor() {
        return LOAD_FACTOR;
    }
}
