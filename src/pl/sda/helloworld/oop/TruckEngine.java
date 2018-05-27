package pl.sda.helloworld.oop;

public class TruckEngine extends Engine {

    boolean hasHalfShifts;

    TruckEngine(boolean hasHalfShifts) {
        super(4.0);
        this.hasHalfShifts = hasHalfShifts;
    }


    String doTruckyThing() {
        return "truck truck mother....r";
    }

    @Override
    public String engineSound() {
        return "pyr pyr";
    }

    @Override
    public String toString() {
        return "TruckEngine{" +
                "hasHalfShifts=" + hasHalfShifts +
                "} " + super.toString();
    }
}
