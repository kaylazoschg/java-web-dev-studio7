package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    double bitrate;
    String artist;

    public CD (boolean isShiny, boolean isScratched, String name, double storageCapacity,
               double openStorage, double runtime, double bitrate, String artist) {
        super(isShiny, isScratched, name, storageCapacity, openStorage, runtime);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    public void CDInfo() {
        System.out.println(name + " by " + artist + " has " + openStorage + "GB open storage, runtime is " + runtime +
                " hours, and bitrate is " + bitrate + ".");
    }

    public double getBitrate() {
        return bitrate;
    }

    public void setBitrate(double bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is now spinning.");
    }

    @Override
    public void stopDisc() {
        System.out.println("CD has stopped spinning.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
