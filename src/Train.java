import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private List<Locomotive> locomotives;
    private List<Carriage> carriages;

    public Train(String name) {
        this.name = name;
        this.locomotives = new ArrayList<>();
        this.carriages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addLocomotive(Locomotive locomotive) {
        locomotives.add(locomotive);
    }

    public void addCarriage(Carriage carriage) {
        carriages.add(carriage);
    }

    public int calculateTotalCargoCapacity() {
        int totalCargoCapacity = 0;
        for (Locomotive locomotive : locomotives) {
            totalCargoCapacity += locomotive.getCargoCapacity();
        }
        for (Carriage carriage : carriages) {
            totalCargoCapacity += carriage.getCargoCapacity();
        }
        return totalCargoCapacity;
    }

    public int calculateTotalPassengerCapacity() {
        int totalPassengerCapacity = 0;
        for (Carriage carriage : carriages) {
            totalPassengerCapacity += carriage.getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }
}