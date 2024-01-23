import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите название поезда: ");
            String trainName = scanner.nextLine();

            Train train = new Train(trainName);

            System.out.print("Введите количество локомотивов: ");
            int numLocomotives = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= numLocomotives; i++) {
                System.out.print("Введите идентификатор локомотива " + i + ": ");
                String locoId = scanner.nextLine();
                System.out.print("Введите грузоподъемность локомотива " + i + ": ");
                int locoCapacity = scanner.nextInt();
                scanner.nextLine();

                train.addLocomotive(new Locomotive(locoId, locoCapacity));
            }

            System.out.print("Введите количество вагонов: ");
            int numCarriages = scanner.nextInt();
            scanner.nextLine();

            for (int i = 1; i <= numCarriages; i++) {
                System.out.print("Введите идентификатор вагона " + i + ": ");
                String carriageId = scanner.nextLine();
                System.out.print("Введите грузоподъемность вагона " + i + ": ");
                int carriageCapacity = scanner.nextInt();
                System.out.print("Введите вместимость пассажиров вагона " + i + ": ");
                int passengerCapacity = scanner.nextInt();
                scanner.nextLine();

                train.addCarriage(new Carriage(carriageId, carriageCapacity, passengerCapacity));
            }


            System.out.println("Название поезда: " + train.getName());
            System.out.println("Общая грузоподъемность: " + train.calculateTotalCargoCapacity());
            System.out.println("Общая вместимость пассажиров: " + train.calculateTotalPassengerCapacity());

            scanner.close();
        }
    }

