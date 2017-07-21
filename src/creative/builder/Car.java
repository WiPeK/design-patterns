package creative.builder;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class Car {

    private String name;

    private int productionYear;

    private String color;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
