package service;

import model.Bike;

/**
 * diese Klasse wid in BikeBuildingServiceTest getestet
 */

public class BikeBuildingServiceImpl implements BikeBuildingService {

    public Bike createCustomBike(String color) {
        Bike yourCustomBike = new Bike();
        yourCustomBike.setColor(color);
        return yourCustomBike;
    }
}
