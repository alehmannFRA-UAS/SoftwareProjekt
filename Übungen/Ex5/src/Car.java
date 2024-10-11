public class Car {

    public final static String[] carSizes = {"RWD", "FWD", "AWD", "4WD"};

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public class Engine {

        private String type;

        public Engine(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

    }

    public Engine createEngine(String type) {
        return new Engine(type);
    }

    public void determineCarSize(Engine engine) {
        if (engine.getType().equals(carSizes[3])) {
            System.out.println("Das Auto ist groß");
        } else {
            System.out.println("Das Auto ist klein");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "X5");
        Car.Engine engine = car.createEngine("4WD");
        System.out.println(engine.getType());
        car.determineCarSize(engine);

        Car car2 = new Car("Audi", "A3");
        Car.Engine engine2 = car2.createEngine("FWD");
        System.out.println(engine2.getType());
        car2.determineCarSize(engine2);
    }

}
