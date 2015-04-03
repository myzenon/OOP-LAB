import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double calAvgPrice(List<Product> productsList) {
        double sum = 0;
        for(Product p : productsList) {
            sum += p.price;
        }
        return  sum / productsList.size();
    }

    public static void addProduct(List<Product> productsList, Product product) {
        boolean sameid = false;
        for(Product p : productsList) {
            if(p.id == product.id) {
                sameid = true;
            }
        }
        if(!sameid) {
            productsList.add(product);
        }
    }


    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        addProduct(productsList, new Product("iPhone", 1, 19999.99));
        addProduct(productsList, new Product("Black Berry Bold 9000", 2, 20000));
        addProduct(productsList, new Product("Nokia 3310", 3, 21500));
        addProduct(productsList, new Product("Black Berry Bold 2500", 2, 15000));

        for(Product p : productsList) {
            System.out.println(p);
        }



        System.out.println("Average Price : " + calAvgPrice(productsList) );
    }
}
