import java.util.List;
import java.util.ArrayList;

public class GenericMethod {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 999999; i++) {
            list.add(i);
        }
        int numberOfOddIntegers = countOddIntegers(list);
        System.out.println("Number of odd integers: " + numberOfOddIntegers);
    }

    // Aufgabe 1
    public static <T extends Number> int countOddIntegers(List<T> list) {
        int count = 0;
        for (T t : list) {
            if (t.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}
