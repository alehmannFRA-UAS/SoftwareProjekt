package builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .addTopping("Salami")
                .addTopping("Cheese")
                .addTopping("Tomato")
                .build();
        System.out.println("This is a pizza with " + pizza.getToppings());
    }

}
