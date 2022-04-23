package vehicles;

public class VehiclesMain {
    public static void main(String[] args) {
        Car cars[] = new Car[5];
        cars[0] = new Car("Fiat", "Panda");
        cars[1] = new Car("Ford", "Fiesta");
        cars[2] = new Car("Volkswagen", "Golf");
        cars[3] = new Car("Renault", "Clio");
        cars[4] = new Car("Peugeot", "206");

        Car thirdCar = cars[2];
        thirdCar.setModel("Passat");

        for (Car car : cars){
            car.show();
        }
    }
}
