public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {
        cargoCapacity = 0;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void printShipInfo() {
        System.out.println(getName() + ", " + cargoCapacity);
    }
}
