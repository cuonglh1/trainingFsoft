package OOP_Bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerVehicle {

    private List<Vehicle> vehicleList;

    public ManagerVehicle() {
        vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);

    }

    public void deleteVehicleById(String id) {
        Vehicle vehicle = vehicleList.stream().filter(v -> v.getId().equals(id)).findFirst().orElse(null);
        if (vehicle == null) {
            System.out.println("khong tim thay phuong tien giao thong!!!");
            return;
        }
        vehicleList.remove(vehicle);
    }

    public List<Vehicle> findByManufacturer(String manufacturer) {

        List<Vehicle> vehicles = vehicleList.stream().filter(v -> v.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
        return vehicles;
    }

    public List<Vehicle> findByColor(String color) {

        List<Vehicle> vehicles = vehicleList.stream().filter(v -> v.getColor().equals(color))
                .collect(Collectors.toList());
        return vehicles;
    }

}
