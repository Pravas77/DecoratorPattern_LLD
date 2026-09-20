public class FixedPercentageProductDecorator extends ProductDecorator {

    private Product product;
    private static double percentage;

    public FixedPercentageProductDecorator(Product product) {
        super(product.getPrice(),product.getProductType());
        this.product = product;
    }

    static {
        percentage = 10.0;
    }


    public double getPrice() {
        double currentPrice = product.getPrice();
        currentPrice -= (currentPrice * percentage)/100;
        return currentPrice;
    }
}
