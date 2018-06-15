package com.example.android.visitwarsawapp;

/**
 * {@link Place} represents a place that the user wants to visit.
 * It contains resource IDs for the place name, address, description and photo.
 **/

public class Place {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the place name
     */
    private int mPlaceNameID;
    /**
     * String resource ID for the place address
     */
    private int mPlaceAddressID;
    /**
     * String resource ID for the place description
     */
    private int mPlaceDescriptionID;
    /**
     * String resource ID for the place photo
     */
    private int mPlacePhotoID = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object.
     */
    public Place(int placeNameID, int placeAddressID, int placeDescriptionID, int placePhotoID) {
        mPlaceNameID = placeNameID;
        mPlaceAddressID = placeAddressID;
        mPlaceDescriptionID = placeDescriptionID;
        mPlacePhotoID = placePhotoID;
    }

    /**
     * Get the string resource ID for the place name.
     */
    public int getPlaceNameID() {
        return mPlaceNameID;
    }

    /**
     * Get the string resource ID for the place address.
     */
    public int getPlaceAddressID() {
        return mPlaceAddressID;
    }

    /**
     * Get the string resource ID for the place description.
     */
    public int getPlaceDescriptionID() {
        return mPlaceDescriptionID;
    }

    /**
     * Get the string resource ID for the place photo.
     */
    public int getPlacePhotoID() {
        return mPlacePhotoID;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mPlacePhotoID != NO_IMAGE_PROVIDED;
    }
}