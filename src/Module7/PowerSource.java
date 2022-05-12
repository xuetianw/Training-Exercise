package Module7;

public class PowerSource {
    private double watts;

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public double supplyPower() {
        return watts;
    }


    @Override
    public String toString() {
        return "PowerSource{" +
                "watts=" + watts +
                '}';
    }
}
