package org.launchcode.studio7;

public class BaseDisc implements OpticalDisc {

    boolean isShiny = true;
    boolean isScratched = false;
    String name;
    double storageCapacity;
    double openStorage;
    double runtime;

    public BaseDisc (boolean isShiny, boolean isScratched, String name, double storageCapacity,
                     double openStorage, double runtime) {
        this.isShiny = isShiny;
        this.isScratched = isScratched;
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.openStorage = openStorage;
        this.runtime = runtime;
    }

    public boolean isShiny() {
        return isShiny;
    }

    public void setShiny(boolean shiny) {
        isShiny = shiny;
    }

    public boolean isScratched() {
        return isScratched;
    }

    public void setScratched(boolean scratched) {
        isScratched = scratched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setOpenStorage(double openStorage) {
        this.openStorage = openStorage;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }


    @Override
    public void spinDisc() {

    }

    @Override
    public void stopDisc() {

    }
}
