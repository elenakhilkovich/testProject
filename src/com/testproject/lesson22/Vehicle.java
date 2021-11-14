package com.testproject.lesson22;

public abstract class Vehicle implements IVehicle {          //транспортное средство

    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();

        }
    }

}
