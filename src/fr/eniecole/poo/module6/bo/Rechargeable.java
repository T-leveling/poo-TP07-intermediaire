package fr.eniecole.poo.module6.bo;

public interface Rechargeable {
    static final int MINIMUM_PERCENT_LEVEL= 0;

    public void charger();
    public void setBatteryLevel(int batteryLevel);
    public int getBatteryLevel();
}
