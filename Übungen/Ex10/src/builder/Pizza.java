package builder;

public class Pizza {

    private String[] toppings;

    Pizza(String[] toppings) {
        this.toppings = toppings;
    }

    public String getToppings() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < toppings.length; i++) {
            sb.append(toppings[i] + " ");
        }
        return sb.toString();
    }

    public static class Builder {
        private String[] toppings;

        public Builder() {
            toppings = new String[0];
        }

        public Builder addTopping(String topping) {
            String[] newToppings = new String[toppings.length + 1];
            for (int i = 0; i < toppings.length; i++) {
                newToppings[i] = toppings[i];
            }
            newToppings[toppings.length] = topping;
            toppings = newToppings;
            return this;
        }

        public Pizza build() {
            return new Pizza(toppings);
        }
    }

}
