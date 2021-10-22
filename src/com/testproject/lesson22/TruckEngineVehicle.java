package com.testproject.lesson22;

public abstract class TruckEngineVehicle extends EngineVehicle {
    public TruckEngineVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}