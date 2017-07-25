package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Krzysztof Adamczyk on 24.07.2017.
 */
public class VehicleFactory {
    private static final Map<String, Vehicle> vehicleMap = new HashMap<>();

    public static Vehicle getVehicle(String name) {
        return vehicleMap.computeIfAbsent(name, Audi::new);
    }
}
