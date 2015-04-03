import java.util.HashSet;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Set<Product> productsSet = new HashSet<Product>();
        productsSet.add(new Product("iPhone", 1, 19999.99));
        productsSet.add(new Product("Black Berry Bold 9000", 2, 20000));
        productsSet.add(new Product("Nokia 3310", 3, 21500));
        productsSet.add(new Product("Black Berry Bold 2500", 2, 15000));

        // Change Set Product to Array
        Object[] productsArray = productsSet.toArray();
        for(int i = 0; i < productsArray.length; i++) {
            System.out.println(productsArray[i]);
        }
    }
}
