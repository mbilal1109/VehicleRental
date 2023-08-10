package com.api.VehicleRental.serviceimpl;

import com.api.VehicleRental.model.Vehicle;
import com.api.VehicleRental.service.VehicleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    List<Vehicle> vehicles = new ArrayList<>();

    private final Logger logger = LoggerFactory.getLogger(VehicleServiceImpl.class);

    @Override
    public void createVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    @Override
    public Vehicle getVehicle(int vehicleId) {
        Vehicle vehicleFound = vehicles.stream().filter(v -> v.getVehicleId() == vehicleId).findAny().get();
        logger.info("Vehicle Found: {}", vehicleFound);
        return vehicleFound;
    }
}
