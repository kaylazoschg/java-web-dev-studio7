package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD(true, true, "Mylo Xyloto", 500,
                200, 2.5, 44100, "Coldplay");
        DVD myDVD = new DVD(true, true, "The Sandlot", 600,
                5, 1.8, 1080);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.CDInfo();
        myDVD.DVDInfo();
    }
}
