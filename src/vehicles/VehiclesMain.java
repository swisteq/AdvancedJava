package vehicles;

public class VehiclesMain {
    public static void main(String[] args) {
        Car cars[] = new Car[5];
        Car car1 = new Car("Fiat", "Panda");
        Car car2 = new Car("Ford", "Fiesta");
        Car car3 = new Car("Volkswagen", "Golf");
        Car car4 = new Car("Renault", "Clio");
        Car car5 = new Car("Peugeot", "206");
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        for (Car car : cars){
            car.show();
        }
    }
}
