import java.util.List;

public class Cart {

    public double calculateTotalCost(List<Product> products){

        double totalCost = 0.0;
        for (Product product : products){
            double price = product.getPrice();
            System.out.println(product.getProductType() + "  " + price);
            totalCost += price;
        }
        return totalCost;
    }
}
