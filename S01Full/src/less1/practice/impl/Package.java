package less1.practice.impl;

public enum Package {
    PLASTIC("Пластик"),
    GLASS("Стекло");

    private final String material;

    Package(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
