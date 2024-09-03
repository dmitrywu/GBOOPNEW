public class HotWater extends Product {

    private int temperature;

    public HotWater(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", Temperature: " + temperature + ", price: " + getPrice() + "\n";

        // return ""Name=" + name + ", price=" + price + " volume=" + volume + "";
    }

}
