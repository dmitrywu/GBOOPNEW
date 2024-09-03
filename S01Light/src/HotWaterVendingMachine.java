import java.util.List;

public class HotWaterVendingMachine implements VendingMachine {

    private int money;

    private final List<Product> productList;

    public HotWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }

        }
        return null;
    }

    public BottleOfWater getProduct(String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume && ((HotWater) product).getTemperature() == temperature) {
                    return (BottleOfWater) product;
                }
            }

        }
        return null;
    }

}
