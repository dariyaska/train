public class Carriage {
    private String id;
    private int cargoCapacity;
    private int passengerCapacity;

    public Carriage(String id, int cargoCapacity, int passengerCapacity) {
        this.id = id;
        this.cargoCapacity = cargoCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public String getId() {
        return id;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}