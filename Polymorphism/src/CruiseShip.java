public class CruiseShip extends Ship {
    private int passengerCapacity;

    public CruiseShip() {
        passengerCapacity = 0;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.println(getName() + ", " + passengerCapacity);
    }
}
