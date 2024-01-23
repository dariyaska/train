public class Locomotive {
    private String id;
    private int cargoCapacity;

    public Locomotive(String id, int cargoCapacity) {
        this.id = id;
        this.cargoCapacity = cargoCapacity;
    }

    public String getId() {
        return id;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}