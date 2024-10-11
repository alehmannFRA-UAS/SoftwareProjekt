public class TestGenericClass {

    public static void main(String[] args) {
        MinMax<String> myMinMax = new MinMax<String>();
        myMinMax.push("A");
        myMinMax.push("B");
        myMinMax.push("Z");
        myMinMax.push("C");
        System.out.println(myMinMax.getMin());
        System.out.println(myMinMax.getMax());

        MinMax<Integer> minMax = new MinMax<>();
        minMax.push(1);
        minMax.push(2);
        minMax.push(3);
        minMax.push(4);
        minMax.push(5);
        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());
        minMax.reset();
        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());
    }

}
