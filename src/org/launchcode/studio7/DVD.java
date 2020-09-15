package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    int resolution;

    public DVD (boolean isShiny, boolean isScratched, String name, double storageCapacity,
                double openStorage, double runtime, int resolution) {
        super(isShiny, isScratched, name, storageCapacity, openStorage, runtime);
        this.resolution = resolution;
    }

    public void DVDInfo() {
        System.out.println(name + " has " + openStorage + "GB open storage, runtime is " + runtime +
                " hours, and resolution is " + resolution + "p.");
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is now spinning.");
    }

    @Override
    public void stopDisc() {
        System.out.println("DVD has stopped spinning.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
