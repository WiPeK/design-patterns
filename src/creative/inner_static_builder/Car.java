package creative.inner_static_builder;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class Car {

    private String name;

    private int productionYear;

    private String color;

    private String type;

    private Car() {}

    private Car(Builder builder) {
        this.name = builder.name;
        this.productionYear = builder.productionYear;
        this.color = builder.color;
        this.type = builder.type;
    }

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

    public static class Builder {
        private String name;

        private int productionYear;

        private String color;

        private String type;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setProductionYear(int year) {
            this.productionYear = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
