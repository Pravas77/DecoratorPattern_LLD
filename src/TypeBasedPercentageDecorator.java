import java.util.Map;

public class TypeBasedPercentageDecorator extends ProductDecorator{

    private Product product;
    private static Map<ProductType,Double> productTypeMap;

    public TypeBasedPercentageDecorator(Product product) {
        super(product.getPrice(),product.getProductType());
        this.product = product;
    }

    static {
        productTypeMap = Map.of(ProductType.FOOD_ITEM,10.0);
    }

    public double getPrice(){
        double percentage = productTypeMap.getOrDefault(getProductType(),0.0);
        double currentPrice = product.getPrice();
        currentPrice -= (currentPrice * percentage)/100;
        return currentPrice;
    }
}
