import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Product> products = new ArrayList<Product>();

        HotWater hw1 = new HotWater("Tea", 50, 99);
        HotWater hw2 = new HotWater("Coffee", 80, 85);
        HotWater hw3 = new HotWater("Warm Water", 13, 40);

        products.add(hw1);
        products.add(hw2);
        products.add(hw3);

        HotWaterVendingMachine hwvm = new HotWaterVendingMachine(products);
        

        System.out.println(products);
        
        System.out.println(hwvm.getProduct("Tea"));
        System.out.println(hwvm.getProduct("Coffee"));
    }
}
