package design.patterns.builders;

import design.patterns.cars.CarType;
import design.patterns.components.Engine;
import design.patterns.components.GPSNavigator;
import design.patterns.components.Transmission;
import design.patterns.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
