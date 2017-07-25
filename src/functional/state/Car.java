package functional.state;

/**
 * Created by Krzysztof Adamczyk on 05.07.2017.
 */
public class Car {

    private CarState carState;

    private String name;

    private int productionYear;

    private String color;

    private String type;

    private Car() {}

    public void setCarState(CarState carState) {
        this.carState = carState;
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

    public void reportStatus() {
        if(carState != null) {
            carState.reportState(this);
        } else {
            System.out.println("unknown status");
        }
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

        private CarState carState;

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

        public Builder state(CarState carState) {
            this.carState = carState;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.setCarState(carState);
            car.setColor(color);
            car.setName(name);
            car.setProductionYear(productionYear);
            car.setType(type);
            return car;
        }
    }
}
