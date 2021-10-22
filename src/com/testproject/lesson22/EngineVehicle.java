package com.testproject.lesson22;

abstract class EngineVehicle extends Vehicle {            //транспортное средство с двигателем
    public EngineVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
