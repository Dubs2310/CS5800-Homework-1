public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship();
        ships[0].setName("Classic Ship");
        ships[0].setYearBuilt("1990");

        ships[1] = new CruiseShip();
        ships[1].setName("Cruise Ship");
        ships[1].setYearBuilt("2000");
        ((CruiseShip) ships[1]).setPassengerCapacity(10);

        ships[2] = new CargoShip();
        ships[2].setName("Cargo Ship");
        ships[2].setYearBuilt("2010");
        ((CargoShip) ships[2]).setCargoCapacity(20);

        for (Ship ship: ships) {
            ship.printShipInfo();
        }
    }
}