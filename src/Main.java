import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//


        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите название поезда: ");
        String trainName = scanner.nextLine();


        Train train = new Train(trainName);


        System.out.print("Введите идентификатор первого локомотива: ");
        String locoId1 = scanner.nextLine();
        System.out.print("Введите грузоподъемность первого локомотива: ");
        int locoCapacity1 = scanner.nextInt();

        System.out.print("Введите идентификатор второго локомотива: ");
        String locoId2 = scanner.next();
        System.out.print("Введите грузоподъемность второго локомотива: ");
        int locoCapacity2 = scanner.nextInt();


        Locomotive locomotive1 = new Locomotive(locoId1, locoCapacity1);
        Locomotive locomotive2 = new Locomotive(locoId2, locoCapacity2);


        scanner.nextLine();

        System.out.print("Введите грузоподъемность первого вагона: ");
        int carriageCapacity1 = scanner.nextInt();

        System.out.print("Введите вместимость пассажиров первого вагона: ");
        int passengerCapacity1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введите грузоподъемность второго вагона: ");
        int carriageCapacity2 = scanner.nextInt();

        System.out.print("Введите вместимость пассажиров второго вагона: ");
        int passengerCapacity2 = scanner.nextInt();


        Carriage carriage1 = new Carriage("Вагон1", carriageCapacity1, passengerCapacity1);
        Carriage carriage2 = new Carriage("Вагон2", carriageCapacity2, passengerCapacity2);


        train.addLocomotive(locomotive1);
        train.addLocomotive(locomotive2);
        train.addCarriage(carriage1);
        train.addCarriage(carriage2);


        System.out.println("Детали поезда:Опаздание на час");
        System.out.println("Название поезда: " + train.getName());
        System.out.println("Общая грузоподъемность: " + train.calculateTotalCargoCapacity());
        System.out.println("Общая вместимость пассажиров: " + train.calculateTotalPassengerCapacity());


        scanner.close();
    }
}