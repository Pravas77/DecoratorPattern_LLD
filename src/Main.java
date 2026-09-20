import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        Product product1 = new TypeBasedPercentageDecorator(
                new FixedPercentageProductDecorator(
                        new ProductItem(1000,ProductType.FOOD_ITEM)));

        Product product2 = new TypeBasedPercentageDecorator(
                new FixedPercentageProductDecorator(
                        new ProductItem(1000,ProductType.MEDICAL_ITEM)));


        Cart cart = new Cart();
        System.out.println("Total Cost  " + cart.calculateTotalCost(List.of(product1,product2)));



    }
}